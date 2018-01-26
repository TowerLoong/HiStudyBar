package com.hi.HiStudyBar.dao.pojo.information;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity  
@Table(name = "university")
public class University {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO) 
	private Integer univId;
	
	@Column(name = "univ_name") 
	private String univName;
	
	@Column(name = "univ_area") 
	private String univArea;

	public University() {
		super();
	}

	public University(Integer univId, String univName, String univArea) {
		super();
		this.univId = univId;
		this.univName = univName;
		this.univArea = univArea;
	}

	@Override
	public String toString() {
		return "University [univId=" + univId + ", univName=" + univName + ", univArea=" + univArea + "]";
	}

	public Integer getUnivId() {
		return univId;
	}

	public void setUnivId(Integer univId) {
		this.univId = univId;
	}

	public String getUnivName() {
		return univName;
	}

	public void setUnivName(String univName) {
		this.univName = univName;
	}

	public String getUnivArea() {
		return univArea;
	}

	public void setUnivArea(String univArea) {
		this.univArea = univArea;
	}
	
}
