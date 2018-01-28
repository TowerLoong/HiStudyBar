package com.hi.HiStudyBar.dao.pojo.adminthing;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * 2018.1.26
 * @author Tower
 * 管理员表对应的实体类
 */
@Entity  
@Table(name = "t_admin")
public class Admin {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO) 
	@Column(name = "admin_id")
	private Integer adminId;//主键
	
	@Column(name = "admin_name" , nullable = false , length = 20) 
	private String adminName;//管理员昵称（少于15个字符）
	
	@Column(name = "admin_password" , nullable = false , length = 20) 
	private String adminPassword;//管理员密码（少于15个字符）
	
	@Column(name = "admin_true_name" , length = 50) 
	private String adminTrueName;//管理员真实姓名（少于30个字符）
	
	@Column(name = "admin_sex" , length = 30) 
	private String adminSex;//管理员性别（少于20个字符）
	
	@Column(name = "admin_head_pic" , length = 150) 
	private String adminHeadPic;//管理员头像路径（少于100个字符）
	
	@Column(name = "admin_phonenumber" , length = 30) 
	private String adminPhonenumber;//管理员电话号码（少于20个字符）
	
	@Column(name = "admin_email" , length = 100) 
	private String adminEmail;//管理员邮箱（少于50个字符）

	public Admin() {
		super();
	}

	public Admin(Integer adminId, String adminName, String adminPassword, String adminTrueName, String adminSex,
			String adminHeadPic, String adminPhonenumber, String adminEmail) {
		super();
		this.adminId = adminId;
		this.adminName = adminName;
		this.adminPassword = adminPassword;
		this.adminTrueName = adminTrueName;
		this.adminSex = adminSex;
		this.adminHeadPic = adminHeadPic;
		this.adminPhonenumber = adminPhonenumber;
		this.adminEmail = adminEmail;
	}

	@Override
	public String toString() {
		return "Admin [adminId=" + adminId + ", adminName=" + adminName + ", adminPassword=" + adminPassword
				+ ", adminTrueName=" + adminTrueName + ", adminSex=" + adminSex + ", adminHeadPic=" + adminHeadPic
				+ ", adminPhonenumber=" + adminPhonenumber + ", adminEmail=" + adminEmail + "]";
	}

	public Integer getAdminId() {
		return adminId;
	}

	public void setAdminId(Integer adminId) {
		this.adminId = adminId;
	}

	public String getAdminName() {
		return adminName;
	}

	public void setAdminName(String adminName) {
		this.adminName = adminName;
	}

	public String getAdminPassword() {
		return adminPassword;
	}

	public void setAdminPassword(String adminPassword) {
		this.adminPassword = adminPassword;
	}

	public String getAdminTrueName() {
		return adminTrueName;
	}

	public void setAdminTrueName(String adminTrueName) {
		this.adminTrueName = adminTrueName;
	}

	public String getAdminSex() {
		return adminSex;
	}

	public void setAdminSex(String adminSex) {
		this.adminSex = adminSex;
	}

	public String getAdminHeadPic() {
		return adminHeadPic;
	}

	public void setAdminHeadPic(String adminHeadPic) {
		this.adminHeadPic = adminHeadPic;
	}

	public String getAdminPhonenumber() {
		return adminPhonenumber;
	}

	public void setAdminPhonenumber(String adminPhonenumber) {
		this.adminPhonenumber = adminPhonenumber;
	}

	public String getAdminEmail() {
		return adminEmail;
	}

	public void setAdminEmail(String adminEmail) {
		this.adminEmail = adminEmail;
	}
	
}
