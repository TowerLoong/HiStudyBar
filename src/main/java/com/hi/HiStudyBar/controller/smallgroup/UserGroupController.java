package com.hi.HiStudyBar.controller.smallgroup;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.hi.HiStudyBar.service.intf.smallgroup.IUserGroupService;

@Controller
@SpringBootApplication
@RequestMapping("/user-group")
public class UserGroupController {

	@Autowired
	private IUserGroupService userGroupService;
	
}
