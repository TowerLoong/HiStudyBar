package com.hi.HiStudyBar.service.impl.information;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hi.HiStudyBar.dao.intf.information.ILabelDao;
import com.hi.HiStudyBar.service.intf.information.ILabelService;

/**
 * 2018.1.30
 * @author Tower
 * 标签业务
 */
@Service
public class LabelServiceImpl implements ILabelService {

	@Autowired
	private ILabelDao labelDao;
	
}
