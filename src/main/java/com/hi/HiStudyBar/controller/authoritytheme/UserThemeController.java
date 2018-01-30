package com.hi.HiStudyBar.controller.authoritytheme;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.hi.HiStudyBar.service.intf.authoritytheme.IUserThemeService;

@Controller
@SpringBootApplication
@RequestMapping("/user-theme")
public class UserThemeController {

	@Autowired
	private IUserThemeService userThemeService;
	
}
