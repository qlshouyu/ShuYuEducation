package com.shouyu.education.course.service.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.shouyu.education.course.service.biz.ApiAdvBiz;
import com.shouyu.education.course.service.common.bo.AdvBO;
import com.shouyu.education.course.service.common.dto.AdvListDTO;
import com.shouyu.education.util.base.BaseController;
import com.shouyu.education.util.base.Result;

import io.swagger.annotations.ApiOperation;

/**
 * 广告信息
 *
 * @author 高露
 */
@RestController
@RequestMapping(value = "/course/api/adv")
public class ApiAdvController extends BaseController {

	@Autowired
	private ApiAdvBiz biz;

	@ApiOperation(value = "广告列表接口", notes = "首页轮播广告列出")
	@RequestMapping(value = "/list", method = RequestMethod.POST)
	public Result<AdvListDTO> list(@RequestBody AdvBO advBO) {
		return biz.list(advBO);
	}

}
