package com.hi.HiStudyBar.controller.smallgroup;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.hi.HiStudyBar.service.intf.smallgroup.IGroupTalkService;

@Controller
@SpringBootApplication
@RequestMapping("/group-talk")
public class GroupTalkController {

	@Autowired
	private IGroupTalkService groupTalkService;
	
}
