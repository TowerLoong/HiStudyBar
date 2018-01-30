package com.hi.HiStudyBar.service.impl.bbs;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hi.HiStudyBar.dao.intf.bbs.INoteCommentDao;
import com.hi.HiStudyBar.service.intf.bbs.INoteCommentService;

/**
 * 2018.1.30
 * @author Tower
 * 帖子评论业务业务
 */
@Service
public class NoteCommentServiceImpl implements INoteCommentService{

	@Autowired
	private INoteCommentDao noteCommentDao;
	
}
