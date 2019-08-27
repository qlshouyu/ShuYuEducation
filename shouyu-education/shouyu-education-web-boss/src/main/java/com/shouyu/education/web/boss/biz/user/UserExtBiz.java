package com.shouyu.education.web.boss.biz.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.multipart.MultipartFile;

import com.shouyu.education.system.feign.IBossSys;
import com.shouyu.education.user.common.bean.qo.UserExtQO;
import com.shouyu.education.user.common.bean.vo.UserExtVO;
import com.shouyu.education.user.feign.IBossUserExt;
import com.shouyu.education.util.aliyun.Aliyun;
import com.shouyu.education.util.aliyun.AliyunUtil;
import com.shouyu.education.util.base.BaseBiz;
import com.shouyu.education.util.base.Page;
import com.shouyu.education.util.enums.PlatformEnum;
import com.shouyu.education.util.tools.BeanUtil;

/**
 * 用户教育信息
 *
 * @author 高露
 */
@Component
public class UserExtBiz extends BaseBiz {

	@Autowired
	private IBossSys bossSys;
	@Autowired
	private IBossUserExt bossUserExt;

	public Page<UserExtVO> listForPage(UserExtQO qo) {
		return bossUserExt.listForPage(qo);
	}

	public int save(UserExtQO qo) {
		return bossUserExt.save(qo);
	}

	public int deleteById(Long id) {
		return bossUserExt.deleteById(id);
	}

	public UserExtVO getById(Long id) {
		return bossUserExt.getById(id);
	}

	public int updateById(UserExtQO qo, MultipartFile headImgFile) {
		if (headImgFile != null && !headImgFile.isEmpty()) {
			qo.setHeadImgUrl(AliyunUtil.uploadPic(PlatformEnum.USER, headImgFile, BeanUtil.copyProperties(bossSys.getSys(), Aliyun.class)));
		}
		return bossUserExt.updateById(qo);
	}

	public UserExtVO getByUserNo(Long userNo) {
		return bossUserExt.getByUserNo(userNo);
	}

	public int updateStatusId(UserExtQO qo) {
		return bossUserExt.updateById(qo);
	}

}
