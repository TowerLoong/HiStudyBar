package com.hi.HiStudyBar.controller.information;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.hi.HiStudyBar.service.intf.information.IFriendService;

@Controller
@SpringBootApplication
@RequestMapping("/friend")
public class FriendController {

	@Autowired
	private IFriendService friendService;
	
}
