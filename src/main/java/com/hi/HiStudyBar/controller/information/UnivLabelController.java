package com.hi.HiStudyBar.controller.information;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.hi.HiStudyBar.service.intf.information.IUnivLabelService;

@Controller
@SpringBootApplication
@RequestMapping("/univ-label")
public class UnivLabelController {

	@Autowired
	private IUnivLabelService univLabelService;
	
}
