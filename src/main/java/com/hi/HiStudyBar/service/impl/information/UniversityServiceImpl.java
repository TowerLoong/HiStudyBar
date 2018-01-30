package com.hi.HiStudyBar.service.impl.information;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hi.HiStudyBar.dao.intf.information.IUniversityDao;
import com.hi.HiStudyBar.dao.pojo.information.University;
import com.hi.HiStudyBar.service.intf.information.IUniversityService;

/**
 * 2018.1.30
 * @author Tower
 * 大学信息业务
 */
@Service
public class UniversityServiceImpl implements IUniversityService{

	@Autowired
	private IUniversityDao universityDao;
	
	@Override
	public String addAUniversity(University university) {
		// TODO Auto-generated method stub
		universityDao.save(university);
		return null;
	}

	@Override
	public String delUniversityById(Integer univId) {
		// TODO Auto-generated method stub
		universityDao.delete(univId);
		return null;
	}

	@Override
	public University findUnivById(Integer univId) {
		// TODO Auto-generated method stub
		University university = universityDao.findOne(univId);
		return university;
	}

	
}
