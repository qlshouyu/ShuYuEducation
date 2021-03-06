package com.shouyu.education.web.boss.biz.course;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.shouyu.education.course.common.bean.qo.ZoneQO;
import com.shouyu.education.course.common.bean.vo.ZoneVO;
import com.shouyu.education.course.feign.IBossZone;
import com.shouyu.education.util.base.BaseBiz;
import com.shouyu.education.util.base.Page;

/**
 * 专区 
 *
 * @author 高露
 */
@Component
public class ZoneBiz extends BaseBiz{

	@Autowired
	private IBossZone bossZone;

	public Page<ZoneVO> listForPage(ZoneQO qo) {
        return bossZone.listForPage(qo);
	}

	public int save(ZoneQO qo) {
		return bossZone.save(qo);
	}

	public int deleteById(Long id) {
		return bossZone.deleteById(id);
	}

	public ZoneVO getById(Long id) {
		return bossZone.getById(id);
	}

	public int updateById(ZoneQO qo) {
		return bossZone.updateById(qo);
	}
	
}
