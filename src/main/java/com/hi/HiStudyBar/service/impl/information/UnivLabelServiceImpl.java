package com.hi.HiStudyBar.service.impl.information;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hi.HiStudyBar.dao.intf.information.IUnivLabelDao;
import com.hi.HiStudyBar.service.intf.information.IUnivLabelService;

/**
 * 2018.1.30
 * @author Tower
 * 大学包含标签业务
 */
@Service
public class UnivLabelServiceImpl implements IUnivLabelService{

	@Autowired
	private IUnivLabelDao univLabelDao;
	
}
