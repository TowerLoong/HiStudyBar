package com.hi.HiStudyBar.dao.pojo.smallgroup;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * 2018.1.27
 * @author Tower
 * 讨论群对应的实体类
 */
@Entity  
@Table(name = "t_group")
public class Group {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO) 
	@Column(name = "g_id")
	private Integer gId;
	
	@Column(name = "g_name" , nullable = false , length = 50) 
	private String gName;//群名字（不超过30个字符）
	
	@Column(name = "g_head_pic" , nullable = false , length = 150) 
	private String gHeadPic;//群头像存储路径（不超过100个字符）
	
	@Column(name = "g_description" , nullable = false , length = 150) 
	private String gDescription;//群描述（不超过100字符）

	public Group() {
		super();
	}

	public Group(Integer gId, String gName, String gHeadPic, String gDescription) {
		super();
		this.gId = gId;
		this.gName = gName;
		this.gHeadPic = gHeadPic;
		this.gDescription = gDescription;
	}

	@Override
	public String toString() {
		return "Group [gId=" + gId + ", gName=" + gName + ", gHeadPic=" + gHeadPic + ", gDescription=" + gDescription
				+ "]";
	}

	public Integer getgId() {
		return gId;
	}

	public void setgId(Integer gId) {
		this.gId = gId;
	}

	public String getgName() {
		return gName;
	}

	public void setgName(String gName) {
		this.gName = gName;
	}

	public String getgHeadPic() {
		return gHeadPic;
	}

	public void setgHeadPic(String gHeadPic) {
		this.gHeadPic = gHeadPic;
	}

	public String getgDescription() {
		return gDescription;
	}

	public void setgDescription(String gDescription) {
		this.gDescription = gDescription;
	}
	
}
