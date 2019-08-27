package com.shouyu.education.course.service.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestBody;

import com.shouyu.education.course.common.bean.qo.OrderPayQO;
import com.shouyu.education.course.common.bean.vo.OrderPayVO;
import com.shouyu.education.course.common.interfaces.BossOrderPay;
import com.shouyu.education.course.service.controller.biz.BossOrderPayBiz;
import com.shouyu.education.util.base.BaseController;
import com.shouyu.education.util.base.Page;

/**
 * 订单支付信息表 
 *
 * @author 高露
 */
@RestController
public class BossOrderPayController extends BaseController implements BossOrderPay{

	@Autowired
	private BossOrderPayBiz biz;
	
	@Override
	public Page<OrderPayVO> listForPage(@RequestBody OrderPayQO qo){
		return biz.listForPage(qo);
	}

    @Override
	public int save(@RequestBody OrderPayQO qo){
		return biz.save(qo);
	}

    @Override	
	public int deleteById(@PathVariable(value = "id") Long id){
		return biz.deleteById(id);
	}
	
    @Override	
	public int updateById(@RequestBody OrderPayQO qo){
		return biz.updateById(qo);
	}
	
    @Override
	public OrderPayVO getById(@PathVariable(value = "id") Long id){
		return biz.getById(id);
	}
	
}
