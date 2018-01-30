package com.hi.HiStudyBar.service.impl.bbs;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hi.HiStudyBar.dao.intf.bbs.IBbsNoteDao;
import com.hi.HiStudyBar.service.intf.bbs.IBbsNoteService;

/**
 * 2018.1.30
 * @author Tower
 * 论坛发帖等业务
 */
@Service
public class BbsNoteServiceImpl implements IBbsNoteService{

	@Autowired
	private IBbsNoteDao bbsNoteDao;
	
}
