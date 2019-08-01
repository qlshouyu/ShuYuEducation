package com.shouyu.education.system.service.biz;

import java.util.List;

import org.apache.commons.collections.CollectionUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.shouyu.education.system.service.common.dto.WebsiteNavDTO;
import com.shouyu.education.system.service.common.dto.WebsiteNavListDTO;
import com.shouyu.education.system.service.dao.WebsiteNavDao;
import com.shouyu.education.system.service.dao.impl.mapper.entity.WebsiteNav;
import com.shouyu.education.util.base.PageUtil;
import com.shouyu.education.util.base.Result;
import com.shouyu.education.util.enums.StatusIdEnum;

/**
 * 站点导航
 *
 * @author wuyun
 */
@Component
public class ApiWebsiteNavBiz {

	@Autowired
	private WebsiteNavDao websiteNavDao;

	public Result<WebsiteNavListDTO> list() {
		WebsiteNavListDTO dto = new WebsiteNavListDTO();
		List<WebsiteNav> list = websiteNavDao.listByStatusIdAndParentId(StatusIdEnum.YES.getCode(), 0L);
		if (CollectionUtils.isNotEmpty(list)) {
			List<WebsiteNavDTO> websiteNavList = PageUtil.copyList(list, WebsiteNavDTO.class);
			for (WebsiteNavDTO webSiteNav : websiteNavList) {
				list = websiteNavDao.listByStatusIdAndParentId(StatusIdEnum.YES.getCode(), webSiteNav.getId());
				webSiteNav.setWebsiteNavList(PageUtil.copyList(list, WebsiteNavDTO.class));
			}
			dto.setWebsiteNavList(websiteNavList);
		}
		return Result.success(dto);
	}

}
