package com.hi.HiStudyBar.controller.bbs;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.hi.HiStudyBar.service.intf.bbs.INoteFocusService;

@Controller
@SpringBootApplication
@RequestMapping("/note-focus")
public class NoteFocusController {

	@Autowired
	private INoteFocusService noteFocusService;
	
}
