package com.shouyu.education.web.boss.biz;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.multipart.MultipartFile;

import com.shouyu.education.system.feign.IBossSys;
import com.shouyu.education.util.aliyun.Aliyun;
import com.shouyu.education.util.aliyun.AliyunUtil;
import com.shouyu.education.util.base.BaseBiz;
import com.shouyu.education.util.enums.PlatformEnum;
import com.shouyu.education.util.tools.BeanUtil;

/**
 * 上传功能
 * 
 * @author 高露
 */
@Component
public class UploadBiz extends BaseBiz {

	@Autowired
	private IBossSys bossSys;

	public Object uploadPic(MultipartFile descFile) {
		String url = null;
		if (descFile != null && !descFile.isEmpty()) {
			url = AliyunUtil.uploadPic(PlatformEnum.COURSE, descFile, BeanUtil.copyProperties(bossSys.getSys(), Aliyun.class));
		}
		Map<String, String> map = new HashMap<String, String>();
		map.put("data", url);
		return map;
	}

}
