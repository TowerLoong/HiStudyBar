package com.hi.HiStudyBar.controller.smallgroup;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.hi.HiStudyBar.service.intf.smallgroup.INoticeService;

@Controller
@SpringBootApplication
@RequestMapping("/notice")
public class NoticeController {

	@Autowired
	private INoticeService noticeService;
	
}
