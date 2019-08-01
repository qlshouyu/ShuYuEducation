package com.shouyu.education.system.service.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import com.shouyu.education.system.common.bean.qo.WebsiteNavArticleQO;
import com.shouyu.education.system.common.bean.vo.WebsiteNavArticleVO;
import com.shouyu.education.system.common.interfaces.BossWebsiteNavArticle;
import com.shouyu.education.system.service.controller.biz.BossWebsiteNavArticleBiz;
import com.shouyu.education.util.base.BaseController;
import com.shouyu.education.util.base.Page;

/**
 * 站点导航文章
 *
 * @author wuyun
 */
@RestController
public class BossWebsiteNavArticleController extends BaseController implements BossWebsiteNavArticle {

	@Autowired
	private BossWebsiteNavArticleBiz biz;

	@Override
	public Page<WebsiteNavArticleVO> listForPage(@RequestBody WebsiteNavArticleQO qo) {
		return biz.listForPage(qo);
	}

	@Override
	public int save(@RequestBody WebsiteNavArticleQO qo) {
		return biz.save(qo);
	}

	@Override
	public int deleteById(@RequestBody Long id) {
		return biz.deleteById(id);
	}

	@Override
	public int updateById(@RequestBody WebsiteNavArticleQO qo) {
		return biz.updateById(qo);
	}

	@Override
	public WebsiteNavArticleVO getById(@RequestBody Long id) {
		return biz.getById(id);
	}

	@Override
	public WebsiteNavArticleVO getByNavId(@PathVariable(value = "navId") Long navId) {
		return biz.getByNavId(navId);
	}

}
