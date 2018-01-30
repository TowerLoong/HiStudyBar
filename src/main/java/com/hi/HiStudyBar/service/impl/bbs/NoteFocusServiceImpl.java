package com.hi.HiStudyBar.service.impl.bbs;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hi.HiStudyBar.dao.intf.bbs.INoteFocusDao;
import com.hi.HiStudyBar.service.intf.bbs.INoteFocusService;

/**
 * 2018.1.30
 * @author Tower
 * 帖子关注业务业务
 */
@Service
public class NoteFocusServiceImpl implements INoteFocusService{

	@Autowired
	private INoteFocusDao notefocusDao;
	
}
