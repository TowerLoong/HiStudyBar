package com.hi.HiStudyBar.service.impl.schedule;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hi.HiStudyBar.dao.intf.schedule.ICourseDao;
import com.hi.HiStudyBar.service.intf.schedule.ICourseService;

/**
 * 2018.1.30
 * @author Tower
 * 课程信息业务
 */
@Service
public class CourseServiceImpl implements ICourseService{

	@Autowired
	private ICourseDao courseDao;
	
}
