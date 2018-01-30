package com.hi.HiStudyBar.controller.schedule;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.hi.HiStudyBar.service.intf.schedule.ICourseService;

@Controller
@SpringBootApplication
@RequestMapping("/course")
public class CourseController {

	@Autowired
	private ICourseService courseService;
	
}
