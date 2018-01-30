package com.hi.HiStudyBar.service.impl.authoritytheme;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hi.HiStudyBar.dao.intf.authoritytheme.IThemeDao;
import com.hi.HiStudyBar.service.intf.authoritytheme.IThemeService;

/**
 * 2018.1.30
 * @author Tower
 * 官方话题业务
 */
@Service
public class ThemeServiceImpl implements IThemeService{

	@Autowired
	private IThemeDao themeDao;
	
}
