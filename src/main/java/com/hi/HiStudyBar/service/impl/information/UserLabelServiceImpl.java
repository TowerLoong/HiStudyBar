package com.hi.HiStudyBar.service.impl.information;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hi.HiStudyBar.dao.intf.information.IUserLabelDao;
import com.hi.HiStudyBar.service.intf.information.IUserLabelService;

/**
 * 2018.1.30
 * @author Tower
 * 用户包含标签业务
 */
@Service
public class UserLabelServiceImpl implements IUserLabelService{

	@Autowired
	private IUserLabelDao userLabelDao;
	
}
