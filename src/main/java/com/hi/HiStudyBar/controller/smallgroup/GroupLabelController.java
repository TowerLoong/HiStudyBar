package com.hi.HiStudyBar.controller.smallgroup;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.hi.HiStudyBar.service.intf.smallgroup.IGroupLabelService;

@Controller
@SpringBootApplication
@RequestMapping("/group-label")
public class GroupLabelController {

	@Autowired
	private IGroupLabelService groupLabelService;
	
}
