package com.hi.HiStudyBar.controller.information;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.hi.HiStudyBar.service.intf.information.ILabelService;

@Controller
@SpringBootApplication
@RequestMapping("/label")
public class LabelController {

	@Autowired
	private ILabelService labelService;
	
}
