/*
 *    Copyright (c) 2018-2025, lengleng All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions are met:
 *
 * Redistributions of source code must retain the above copyright notice,
 * this list of conditions and the following disclaimer.
 * Redistributions in binary form must reproduce the above copyright
 * notice, this list of conditions and the following disclaimer in the
 * documentation and/or other materials provided with the distribution.
 * Neither the name of the pig4cloud.com developer nor the names of its
 * contributors may be used to endorse or promote products derived from
 * this software without specific prior written permission.
 * Author: lengleng (wangiegie@gmail.com)
 */
package com.pig4cloud.pigx.ccxxicu.service.impl.patient;


import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.pig4cloud.pigx.ccxxicu.api.entity.patient.TumbleFall;
import com.pig4cloud.pigx.ccxxicu.mapper.patient.TumbleFallMapper;
import com.pig4cloud.pigx.ccxxicu.service.patient.TumbleFallService;
import org.springframework.stereotype.Service;

/**
 * 跌倒、坠床记录表
 *
 * @author pigx code generator
 * @date 2019-09-29 10:10:03
 */
@Service
public class TumbleFallServiceImpl extends ServiceImpl<TumbleFallMapper, TumbleFall> implements TumbleFallService {
	@Override
	public IPage selectByPage(Page page, TumbleFall tumbleFall) {
		return baseMapper.selectByPage(page,tumbleFall);
	}
}
