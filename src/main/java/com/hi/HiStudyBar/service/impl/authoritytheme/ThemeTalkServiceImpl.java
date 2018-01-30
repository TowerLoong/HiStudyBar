package com.hi.HiStudyBar.service.impl.authoritytheme;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hi.HiStudyBar.dao.intf.authoritytheme.IThemeTalkDao;
import com.hi.HiStudyBar.service.intf.authoritytheme.IThemeTalkService;

/**
 * 2018.1.30
 * @author Tower
 * 官方话题的聊天记录业务
 */
@Service
public class ThemeTalkServiceImpl implements IThemeTalkService{

	@Autowired
	private IThemeTalkDao themeTalkDao;
	
}
