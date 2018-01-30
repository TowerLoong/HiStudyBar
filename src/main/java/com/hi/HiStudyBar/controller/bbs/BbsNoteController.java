package com.hi.HiStudyBar.controller.bbs;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.hi.HiStudyBar.service.intf.bbs.IBbsNoteService;

@Controller
@SpringBootApplication
@RequestMapping("/bbs-note")
public class BbsNoteController {

	@Autowired
	private IBbsNoteService bbsNoteService;
	
}
