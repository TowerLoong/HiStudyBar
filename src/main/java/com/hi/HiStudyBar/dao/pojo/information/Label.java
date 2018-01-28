package com.hi.HiStudyBar.dao.pojo.information;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * 2017.1.26
 * @author Tower
 * 标签表对应的实体类
 * 用户、学校、群都有属于它们的可以选择佩戴的标签，这些标签都存放在一个表里面
 * 标签类型中的“1”代表用户，“2”代表学校，“3”代表群
 */
@Entity  
@Table(name = "t_label")
public class Label {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO) 
	@Column(name = "l_id")
	private Integer lId;//主键
	
	@Column(name = "l_description" , length = 20 ) 
	private String lDescription;//标签描述（少于10个字符）
	
	@Column(name = "l_type" , length = 20 ) 
	private String lType;//标签类型（少于10个字符，“1”代表用户，“2”代表学校，“3”代表群）

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
