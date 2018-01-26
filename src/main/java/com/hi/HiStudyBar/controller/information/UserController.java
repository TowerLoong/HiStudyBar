package com.hi.HiStudyBar.controller.information;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.hi.HiStudyBar.dao.intf.information.IUniversityDao;
import com.hi.HiStudyBar.dao.intf.information.IUserDao;
import com.hi.HiStudyBar.dao.pojo.information.User;

@Controller
@SpringBootApplication
@RequestMapping("/user")
public class UserController {

	@Autowired
	private IUserDao userDao;
	
	@Autowired
	private IUniversityDao universityDao;
	
	@RequestMapping("/add")
	@ResponseBody 
	public User addUser(User user){
	
		userDao.save(user);
		return user;
	}
}
