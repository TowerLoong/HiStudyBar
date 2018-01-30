package com.hi.HiStudyBar.service.impl.information;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hi.HiStudyBar.dao.intf.information.IUserDao;
import com.hi.HiStudyBar.service.intf.information.IUserService;

/**
 * 2018.1.30
 * @author Tower
 * 用户信息业务
 */
@Service
public class UserServiceImpl implements IUserService{

	@Autowired
	private IUserDao userDao;
	
}
