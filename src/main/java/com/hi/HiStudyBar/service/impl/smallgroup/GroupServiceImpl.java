package com.hi.HiStudyBar.service.impl.smallgroup;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hi.HiStudyBar.dao.intf.smallgroup.IGroupDao;
import com.hi.HiStudyBar.service.intf.smallgroup.IGroupService;

/**
 * 2018.1.30
 * @author Tower
 * 群信息业务
 */
@Service
public class GroupServiceImpl implements  IGroupService{

	@Autowired
	private IGroupDao groupDao;
	
}
