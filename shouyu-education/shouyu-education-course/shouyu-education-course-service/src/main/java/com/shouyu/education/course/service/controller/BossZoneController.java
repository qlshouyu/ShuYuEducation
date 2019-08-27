package com.shouyu.education.course.service.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestBody;

import com.shouyu.education.course.common.bean.qo.ZoneQO;
import com.shouyu.education.course.common.bean.vo.ZoneVO;
import com.shouyu.education.course.common.interfaces.BossZone;
import com.shouyu.education.course.service.controller.biz.BossZoneBiz;
import com.shouyu.education.util.base.BaseController;
import com.shouyu.education.util.base.Page;

/**
 * 专区 
 *
 * @author 高露
 */
@RestController
public class BossZoneController extends BaseController implements BossZone{

	@Autowired
	private BossZoneBiz biz;
	
	@Override
	public Page<ZoneVO> listForPage(@RequestBody ZoneQO qo){
		return biz.listForPage(qo);
	}

    @Override
	public int save(@RequestBody ZoneQO qo){
		return biz.save(qo);
	}

    @Override	
	public int deleteById(@PathVariable(value = "id") Long id){
		return biz.deleteById(id);
	}
	
    @Override	
	public int updateById(@RequestBody ZoneQO qo){
		return biz.updateById(qo);
	}
	
    @Override
	public ZoneVO getById(@PathVariable(value = "id") Long id){
		return biz.getById(id);
	}

	@Override
	public List<ZoneVO> listAllZone() {
		return biz.listAllZone();
	}
	
}
