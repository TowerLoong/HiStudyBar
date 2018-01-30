package com.hi.HiStudyBar.service.impl.adminthing;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hi.HiStudyBar.dao.intf.adminthing.IAdminDao;
import com.hi.HiStudyBar.service.intf.adminthing.IAdminService;

/**
 * 2018.1.30
 * @author Tower
 * 管理员业务
 */
@Service
public class AdminServiceImpl implements IAdminService{

	@Autowired
	private IAdminDao adminDao;
	
}
