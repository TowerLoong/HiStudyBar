package com.hi.HiStudyBar.dao.pojo.information;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity  
@Table(name = "admin")
public class Admin {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO) 
	@Column(name = "admin_id")
	private Integer adminId;
	
	@Column(name = "admin_name" , nullable = false , length = 20) 
	private String adminName;
	
	@Column(name = "admin_password" , nullable = false , length = 20) 
	private String adminPassword;
	
	@Column(name = "admin_true_name" , length = 20) 
	private String adminTrueName;
	
	@Column(name = "admin_sex" , length = 2) 
	private String adminSex;
	
	@Column(name = "admin_head_pic" , length = 100) 
	private String adminHeadPic;
	
	@Column(name = "admin_phonenumber" , length = 20) 
	private String adminPhonenumber;
	
	@Column(name = "admin_email" , length = 50) 
	private String adminEmail;

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
