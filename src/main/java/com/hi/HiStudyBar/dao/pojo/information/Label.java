package com.hi.HiStudyBar.dao.pojo.information;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity  
@Table(name = "label")
public class Label {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO) 
	private Integer lId;
	
	@Column(name = "l_description") 
	private String lDescription;
	
	@Column(name = "l_type") 
	private String lType;

	public Label() {
		super();
	}

	public Label(Integer lId, String lDescription, String lType) {
		super();
		this.lId = lId;
		this.lDescription = lDescription;
		this.lType = lType;
	}

	@Override
	public String toString() {
		return "Label [lId=" + lId + ", lDescription=" + lDescription + ", lType=" + lType + "]";
	}

	public Integer getlId() {
		return lId;
	}

	public void setlId(Integer lId) {
		this.lId = lId;
	}

	public String getlDescription() {
		return lDescription;
	}

	public void setlDescription(String lDescription) {
		this.lDescription = lDescription;
	}

	public String getlType() {
		return lType;
	}

	public void setlType(String lType) {
		this.lType = lType;
	}
	
}
