package com.hi.HiStudyBar.service.impl.smallgroup;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hi.HiStudyBar.dao.intf.smallgroup.IGroupTalkDao;
import com.hi.HiStudyBar.service.intf.smallgroup.IGroupTalkService;

/**
 * 2018.1.30
 * @author Tower
 * 群聊天记录业务
 */
@Service
public class GroupTalkServiceImpl implements IGroupTalkService{

	@Autowired
	private IGroupTalkDao groupTalkDao;
	
}
