package com.hi.HiStudyBar.service.intf.information;

import com.hi.HiStudyBar.dao.pojo.information.University;

public interface IUniversityService {

	public String addAUniversity(University university);
	
	public String delUniversityById(Integer univId);
	
	public University findUnivById(Integer univId);
	
}
