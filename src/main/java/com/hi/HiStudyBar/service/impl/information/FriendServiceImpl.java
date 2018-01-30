package com.hi.HiStudyBar.service.impl.information;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hi.HiStudyBar.dao.intf.information.IFriendDao;
import com.hi.HiStudyBar.service.intf.information.IFriendService;

/**
 * 2018.1.30
 * @author Tower
 * 好友信息业务
 */
@Service
public class FriendServiceImpl implements IFriendService{

	@Autowired
	private IFriendDao friendDao;
	
	
}
