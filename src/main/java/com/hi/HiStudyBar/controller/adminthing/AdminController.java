package com.hi.HiStudyBar.controller.adminthing;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.hi.HiStudyBar.service.intf.adminthing.IAdminService;

@Controller
@SpringBootApplication
@RequestMapping("/admin")
public class AdminController {

	@Autowired
	private IAdminService adminService;
	
}
