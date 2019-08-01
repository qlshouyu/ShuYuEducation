package com.shouyu.education.system.service.biz;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;

import com.shouyu.education.system.service.common.bo.WebsiteNavArticleBO;
import com.shouyu.education.system.service.common.dto.WebsiteNavArticleDTO;
import com.shouyu.education.system.service.dao.WebsiteNavArticleDao;
import com.shouyu.education.system.service.dao.impl.mapper.entity.WebsiteNavArticle;
import com.shouyu.education.util.base.Result;
import com.shouyu.education.util.enums.StatusIdEnum;
import com.shouyu.education.util.tools.BeanUtil;
import com.xiaoleilu.hutool.util.ObjectUtil;

/**
 * 站点导航文章
 *
 * @author wuyun
 */
@Component
public class ApiWebsiteNavArticleBiz {

	@Autowired
	private WebsiteNavArticleDao dao;

	public Result<WebsiteNavArticleDTO> get(WebsiteNavArticleBO websiteNavArticleBO) {
		if (StringUtils.isEmpty(websiteNavArticleBO.getNavId())) {
			return Result.error("navId不能为空");
		}
		WebsiteNavArticle websiteNavArticle = dao.getByNavIdAndStatusId(websiteNavArticleBO.getNavId(), StatusIdEnum.YES.getCode());
		if (ObjectUtil.isNull(websiteNavArticle)) {
			return Result.error("没有找到站点导航文章信息");
		}
		return Result.success(BeanUtil.copyProperties(websiteNavArticle, WebsiteNavArticleDTO.class));
	}
}
