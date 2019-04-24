package com.entitycourse.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.entitycourse.mapper.EntitycourseMapper;
import com.entitycourse.service.EntityCourseService;
@Service
public class EntityCourseServiceImpl implements EntityCourseService{
	@Autowired
	private EntitycourseMapper mapper;
}
