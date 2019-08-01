package com.shouyu.education.user.service.dao;

import com.shouyu.education.user.service.dao.impl.mapper.entity.Platform;
import com.shouyu.education.user.service.dao.impl.mapper.entity.PlatformExample;
import com.shouyu.education.util.base.Page;

public interface PlatformDao {
	int save(Platform record);

	int deleteById(Long id);

	int updateById(Platform record);

	Platform getById(Long id);

	Page<Platform> listForPage(int pageCurrent, int pageSize, PlatformExample example);

	Platform getByClientId(String clientId);
}