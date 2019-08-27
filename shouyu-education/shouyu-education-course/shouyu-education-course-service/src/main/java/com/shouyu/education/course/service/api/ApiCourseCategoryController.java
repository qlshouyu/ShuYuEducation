package com.shouyu.education.course.service.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.shouyu.education.course.service.biz.ApiCourseCategoryBiz;
import com.shouyu.education.course.service.common.dto.CourseCategoryListDTO;
import com.shouyu.education.util.base.BaseController;
import com.shouyu.education.util.base.Result;

import io.swagger.annotations.ApiOperation;

/**
 * 课程分类
 *
 * @author 高露
 */
@RestController
@RequestMapping(value = "/course/api/course/category")
public class ApiCourseCategoryController extends BaseController {

	@Autowired
	private ApiCourseCategoryBiz biz;

	/**
	 * 普通课程分类列表接口
	 * 
	 * @author wuyun
	 */
	@ApiOperation(value = "课程分类列表接口", notes = "课程分类列表")
	@RequestMapping(value = "/list", method = RequestMethod.POST)
	public Result<CourseCategoryListDTO> list() {
		return biz.list();
	}

}
