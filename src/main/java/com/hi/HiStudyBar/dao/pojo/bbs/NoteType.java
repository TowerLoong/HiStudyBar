package com.hi.HiStudyBar.dao.pojo.bbs;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * 2018.1.27
 * @author Tower
 * 帖子类型表对应的实体类
 * 包含求助帖（help）、项目帖（project）、（活动比赛等的）组队贴（union）、分享帖（share）
 */
@Entity  
@Table(name = "t_note_type")
public class NoteType {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO) 
	@Column(name = "nt_id")
	private Integer ntId;//主键
	
	@Column(name = "nt_title" , nullable = false , length = 20) 
	private String ntType;//帖子类型（少于10个字符，不能为空）
	
	@Column(name = "nt_pic" , nullable = false , length = 150) 
	private String ntPic;//帖子对应的图标的路径（少于100个字符，不能为空）

	public NoteType() {
		super();
	}

	public NoteType(Integer ntId, String ntType, String ntPic) {
		super();
		this.ntId = ntId;
		this.ntType = ntType;
		this.ntPic = ntPic;
	}

	@Override
	public String toString() {
		return "NoteType [ntId=" + ntId + ", ntType=" + ntType + ", ntPic=" + ntPic + "]";
	}

	public Integer getNtId() {
		return ntId;
	}

	public void setNtId(Integer ntId) {
		this.ntId = ntId;
	}

	public String getNtType() {
		return ntType;
	}

	public void setNtType(String ntType) {
		this.ntType = ntType;
	}

	public String getNtPic() {
		return ntPic;
	}

	public void setNtPic(String ntPic) {
		this.ntPic = ntPic;
	}
	
}
