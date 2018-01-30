package com.hi.HiStudyBar.service.impl.schedule;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hi.HiStudyBar.dao.intf.schedule.ICourseScheduleDao;
import com.hi.HiStudyBar.service.intf.schedule.ICourseScheduleService;

/**
 * 2018.1.30
 * @author Tower
 * 课程表业务
 */
@Service
public class CourseScheduleServiceImpl implements ICourseScheduleService{

	@Autowired
	private ICourseScheduleDao courseScheduleDao;
	
}
