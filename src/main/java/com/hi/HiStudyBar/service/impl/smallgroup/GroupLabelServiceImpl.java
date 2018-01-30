package com.hi.HiStudyBar.service.impl.smallgroup;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hi.HiStudyBar.dao.intf.smallgroup.IGroupLabelDao;
import com.hi.HiStudyBar.service.intf.smallgroup.IGroupLabelService;

/**
 * 2018.1.30
 * @author Tower
 * 群包含标签业务
 */
@Service
public class GroupLabelServiceImpl implements IGroupLabelService{

	@Autowired
	private IGroupLabelDao groupLabelDao;
	
}
