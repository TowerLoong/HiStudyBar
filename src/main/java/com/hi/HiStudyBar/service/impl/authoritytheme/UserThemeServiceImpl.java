package com.hi.HiStudyBar.service.impl.authoritytheme;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hi.HiStudyBar.dao.intf.authoritytheme.IUserThemeDao;
import com.hi.HiStudyBar.service.intf.authoritytheme.IUserThemeService;

/**
 * 2018.1.30
 * @author Tower
 * 用户参与官方话题业务
 */
@Service
public class UserThemeServiceImpl implements IUserThemeService{

	@Autowired
	private IUserThemeDao userThemeDao;
	
}
