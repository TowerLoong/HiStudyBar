package com.hi.HiStudyBar.controller.bbs;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.hi.HiStudyBar.service.intf.bbs.INoteCommentService;

@Controller
@SpringBootApplication
@RequestMapping("/note-comment")
public class NoteCommentController {

	@Autowired
	private INoteCommentService noteCommentService;
	
}
