package com.shouyu.education.system.service.biz;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.shouyu.education.system.service.common.dto.WebsiteLinkDTO;
import com.shouyu.education.system.service.common.dto.WebsiteLinkListDTO;
import com.shouyu.education.system.service.dao.WebsiteLinkDao;
import com.shouyu.education.system.service.dao.impl.mapper.entity.WebsiteLink;
import com.shouyu.education.util.base.PageUtil;
import com.shouyu.education.util.base.Result;
import com.shouyu.education.util.enums.StatusIdEnum;

/**
 * 站点友情链接
 *
 * @author wuyun
 */
@Component
public class ApiWebsiteLinkBiz {

	@Autowired
	private WebsiteLinkDao dao;

	public Result<WebsiteLinkListDTO> list() {
		List<WebsiteLink> websiteLinkList = dao.listByStatusId(StatusIdEnum.YES.getCode());
		WebsiteLinkListDTO dto = new WebsiteLinkListDTO();
		dto.setWebsiteLinkList(PageUtil.copyList(websiteLinkList, WebsiteLinkDTO.class));
		return Result.success(dto);
	}

}
