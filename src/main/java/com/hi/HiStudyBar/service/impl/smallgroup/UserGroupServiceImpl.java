package com.hi.HiStudyBar.service.impl.smallgroup;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hi.HiStudyBar.dao.intf.smallgroup.IUserGroupDao;
import com.hi.HiStudyBar.service.intf.smallgroup.IUserGroupService;

/**
 * 2018.1.30
 * @author Tower
 * 用户加入群业务
 */
@Service
public class UserGroupServiceImpl implements IUserGroupService{

	@Autowired
	private IUserGroupDao userGroupDao;
	
}
