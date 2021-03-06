package com.hi.HiStudyBar.dao.pojo.information;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * 2018.1.26
 * @author Tower
 * 大学信息表对应的实体类
 */
@Entity  
@Table(name = "t_university")
public class University {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO) 
	@Column(name = "univ_id")
	private Integer univId;//主键
	
	@Column(name = "univ_name" , length = 100) 
	private String univName;//大学名称（少于50个字符）
	
	@Column(name = "univ_area" , length = 100) 
	private String univArea;//大学校区（少于50个字符）

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
