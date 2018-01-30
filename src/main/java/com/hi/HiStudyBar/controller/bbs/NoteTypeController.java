package com.hi.HiStudyBar.controller.bbs;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.hi.HiStudyBar.service.intf.bbs.INoteTypeService;

@Controller
@SpringBootApplication
@RequestMapping("/note-type")
public class NoteTypeController {

	@Autowired
	private INoteTypeService noteTypeService;
	
}
