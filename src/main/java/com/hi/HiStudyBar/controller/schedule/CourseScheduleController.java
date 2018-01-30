package com.hi.HiStudyBar.controller.schedule;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.hi.HiStudyBar.service.intf.schedule.ICourseScheduleService;

@Controller
@SpringBootApplication
@RequestMapping("/course-schedule")
public class CourseScheduleController {

	@Autowired
	private ICourseScheduleService courseScheduleService;
	
}
