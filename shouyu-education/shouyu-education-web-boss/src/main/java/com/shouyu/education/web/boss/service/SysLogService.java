/**
 * Copyright 2015-现在 鼎斗信息科技有限公司
 */
package com.shouyu.education.web.boss.service;

import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.shouyu.education.util.base.Page;
import com.shouyu.education.util.base.PageUtil;
import com.shouyu.education.util.tools.DateUtil;
import com.shouyu.education.web.boss.common.bean.qo.SysLogQO;
import com.shouyu.education.web.boss.common.bean.vo.SysLogVO;
import com.shouyu.education.web.boss.service.dao.SysLogDao;
import com.shouyu.education.web.boss.service.dao.impl.mapper.entity.SysLog;
import com.shouyu.education.web.boss.service.dao.impl.mapper.entity.SysLogExample;
import com.shouyu.education.web.boss.service.dao.impl.mapper.entity.SysLogExample.Criteria;

/**
 * 后台操作日志表 
 *
 * @author wujing123
 * @since 2018-01-29
 */
@Component
public class SysLogService {

	@Autowired
	private SysLogDao dao;

	public Page<SysLogVO> listForPage(SysLogQO qo) {
	    SysLogExample example = new SysLogExample();
	    Criteria c = example.createCriteria();
	    if (StringUtils.isNotEmpty(qo.getRealName())){
	    	c.andRealNameLike(PageUtil.like(qo.getRealName()));
	    }
	    if (StringUtils.isNotEmpty(qo.getBeginDate())){
			c.andGmtCreateGreaterThanOrEqualTo(DateUtil.parseDate(qo.getBeginDate(),"yyyy-MM-dd"));
		}
		if (StringUtils.isNotEmpty(qo.getEndDate())){
			c.andGmtCreateLessThanOrEqualTo(DateUtil.addDate(DateUtil.parseDate(qo.getEndDate(),"yyyy-MM-dd"), 1));
		}
	    example.setOrderByClause(" id desc ");
        Page<SysLog> page = dao.listForPage(qo.getPageCurrent(), qo.getPageSize(), example);
        return PageUtil.transform(page, SysLogVO.class);
	}

}
