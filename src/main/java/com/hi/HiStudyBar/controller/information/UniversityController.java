package com.hi.HiStudyBar.controller.information;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.hi.HiStudyBar.dao.pojo.information.University;
import com.hi.HiStudyBar.service.information.intf.IUniversityService;

@Controller
@SpringBootApplication
@RequestMapping("/university")
public class UniversityController {

	@Autowired
	private IUniversityService universityService;

	@RequestMapping("/add")
	@ResponseBody 
	public University addUniversity(University university) {
		
		universityService.addAUniversity(university);
		return university;
		
	}
	
	@RequestMapping("/deleteById")
	@ResponseBody 
	public String delUniversityById(@RequestParam("univId") Integer univId){
		
		universityService.delUniversityById(univId);
		return null;
		
	}
	
	@RequestMapping("/findById")
	@ResponseBody 
	public University findUniversityById(@RequestParam("univId") Integer univId){
		
		University x = null;
		x = universityService.findUnivById(univId);
		return x;
		
	}

}
