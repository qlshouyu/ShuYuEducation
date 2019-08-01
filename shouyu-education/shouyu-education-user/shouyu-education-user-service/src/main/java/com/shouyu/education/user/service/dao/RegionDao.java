package com.shouyu.education.user.service.dao;

import java.util.List;

import com.shouyu.education.user.service.dao.impl.mapper.entity.Region;
import com.shouyu.education.user.service.dao.impl.mapper.entity.RegionExample;
import com.shouyu.education.util.base.Page;

public interface RegionDao {
	int save(Region record);

	int deleteById(Long id);

	int updateById(Region record);

	Region getById(Long id);

	Page<Region> listForPage(int pageCurrent, int pageSize, RegionExample example);

	List<Region> listByLevel(Integer level);

	List<Region> listByProvinceId(Integer provinceId);

	List<Region> listByCityId(Integer cityId);
}