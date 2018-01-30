package com.hi.HiStudyBar.service.impl.smallgroup;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hi.HiStudyBar.dao.intf.smallgroup.INoticeDao;
import com.hi.HiStudyBar.service.intf.smallgroup.INoticeService;

/**
 * 2018.1.30
 * @author Tower
 * 群公告信息业务
 */
@Service
public class NoticeServiceImpl implements INoticeService{

	@Autowired
	private INoticeDao noticeDao;
	
}
