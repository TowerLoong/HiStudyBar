package com.hi.HiStudyBar.dao.pojo.authoritytheme;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * 2018.1.27
 * @author Tower
 * 官方话题（大群）表对应的实体类
 */
@Entity  
@Table(name = "t_theme")
public class Theme {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO) 
	@Column(name = "t_id")
	private Integer tId;
	
	@Column(name = "t_name" , nullable = false , length = 50) 
	private String tName;//话题名字（少于30个字符）
	
	@Column(name = "t_description" , nullable = false , length = 255) 
	private String tDescription;//话题描述（少于200个字符）
	
	@Column(name = "t_head_pic" , nullable = false , length = 150) 
	private String tHeadPic;//话题头像路径（少于100个字符）

	@Column(name = "t_begintime") 
	private Date tBegintime;//话题开始时间（精确到秒）
	
	@Column(name = "t_endtime") 
	private Date tEndtime;//话题结束时间（精确到秒）

	public Theme() {
		super();
	}

	public Theme(Integer tId, String tName, String tDescription, String tHeadPic, Date tBegintime, Date tEndtime) {
		super();
		this.tId = tId;
		this.tName = tName;
		this.tDescription = tDescription;
		this.tHeadPic = tHeadPic;
		this.tBegintime = tBegintime;
		this.tEndtime = tEndtime;
	}

	@Override
	public String toString() {
		return "Theme [tId=" + tId + ", tName=" + tName + ", tDescription=" + tDescription + ", tHeadPic=" + tHeadPic
				+ ", tBegintime=" + tBegintime + ", tEndtime=" + tEndtime + "]";
	}

	public Integer gettId() {
		return tId;
	}

	public void settId(Integer tId) {
		this.tId = tId;
	}

	public String gettName() {
		return tName;
	}

	public void settName(String tName) {
		this.tName = tName;
	}

	public String gettDescription() {
		return tDescription;
	}

	public void settDescription(String tDescription) {
		this.tDescription = tDescription;
	}

	public String gettHeadPic() {
		return tHeadPic;
	}

	public void settHeadPic(String tHeadPic) {
		this.tHeadPic = tHeadPic;
	}

	public Date gettBegintime() {
		return tBegintime;
	}

	public void settBegintime(Date tBegintime) {
		this.tBegintime = tBegintime;
	}

	public Date gettEndtime() {
		return tEndtime;
	}

	public void settEndtime(Date tEndtime) {
		this.tEndtime = tEndtime;
	}
	
}
