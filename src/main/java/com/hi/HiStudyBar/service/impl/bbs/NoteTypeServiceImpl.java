package com.hi.HiStudyBar.service.impl.bbs;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hi.HiStudyBar.dao.intf.bbs.INoteTypeDao;
import com.hi.HiStudyBar.service.intf.bbs.INoteTypeService;

/**
 * 2018.1.30
 * @author Tower
 * 帖子类型业务
 */
@Service
public class NoteTypeServiceImpl implements INoteTypeService{

	@Autowired
	private INoteTypeDao noteTypeDao;
	
}
