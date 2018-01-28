package com.hi.HiStudyBar.dao.pojo.information;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * 2018.1.26
 * @author Tower
 * 用户表对应的实体类
 */
@Entity  
@Table(name = "t_user")
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO) 
	@Column(name = "u_id")
	private Integer uId;//主键
	
	@Column(name = "u_name", nullable = false , length = 20) 
	private String uName;//用户昵称（少于15个字符）
	
	@Column(name = "u_password", nullable = false , length = 20) 
	private String uPassword;//用户密码（少于15个字符）
	
	@Column(name = "u_true_name" , length = 50) 
	private String uTrueName;//用户的真实姓名（少于30个字符）
	
	@Column(name = "u_sex" , length = 30) 
	private String uSex;//用户性别（少于20个字符）
	
	@Column(name = "u_head_pic" , length = 150) 
	private String uHeadPic;//用户头像的路径（少于100个字符）
	
	 // 多对一：optional=false表示外键不能为空
	@ManyToOne(optional = true)
	@JoinColumn(name = "univ_id")
	private University university;//用户的大学（外键）
	
	@Column(name = "u_institute" , length = 100) 
	private String uInstitute;//用户的学院（少于50个字符）
	
	@Column(name = "u_magor" , length = 100) 
	private String uMagor;//用户的专业（少于50个字符）
	
	@Column(name = "u_phonenumber" , length = 30) 
	private String uPhonenumber;//用户的电话号码（少于20个字符）
	
	@Column(name = "u_email" , length = 100) 
	private String uEmail;//用户的邮箱（少于50个字符）

	public User() {
		super();
	}

	public User(Integer uId, String uName, String uPassword, String uTrueName, String uSex, String uHeadPic,
			University university, String uInstitute, String uMagor, String uPhonenumber, String uEmail) {
		super();
		this.uId = uId;
		this.uName = uName;
		this.uPassword = uPassword;
		this.uTrueName = uTrueName;
		this.uSex = uSex;
		this.uHeadPic = uHeadPic;
		this.university = university;
		this.uInstitute = uInstitute;
		this.uMagor = uMagor;
		this.uPhonenumber = uPhonenumber;
		this.uEmail = uEmail;
	}
	
	@Override
	public String toString() {
		return "User [uId=" + uId + ", uName=" + uName + ", uPassword=" + uPassword + ", uTrueName=" + uTrueName
				+ ", uSex=" + uSex + ", uHeadPic=" + uHeadPic + ", university=" + university + ", uInstitute="
				+ uInstitute + ", uMagor=" + uMagor + ", uPhonenumber=" + uPhonenumber + ", uEmail=" + uEmail + "]";
	}

	public Integer getuId() {
		return uId;
	}

	public void setuId(Integer uId) {
		this.uId = uId;
	}

	public String getuName() {
		return uName;
	}

	public void setuName(String uName) {
		this.uName = uName;
	}

	public String getuPassword() {
		return uPassword;
	}

	public void setuPassword(String uPassword) {
		this.uPassword = uPassword;
	}

	public String getuTrueName() {
		return uTrueName;
	}

	public void setuTrueName(String uTrueName) {
		this.uTrueName = uTrueName;
	}

	public String getuSex() {
		return uSex;
	}

	public void setuSex(String uSex) {
		this.uSex = uSex;
	}

	public String getuHeadPic() {
		return uHeadPic;
	}

	public void setuHeadPic(String uHeadPic) {
		this.uHeadPic = uHeadPic;
	}

	public University getUniversity() {
		return university;
	}

	public void setUniversity(University university) {
		this.university = university;
	}

	public String getuInstitute() {
		return uInstitute;
	}

	public void setuInstitute(String uInstitute) {
		this.uInstitute = uInstitute;
	}

	public String getuMagor() {
		return uMagor;
	}

	public void setuMagor(String uMagor) {
		this.uMagor = uMagor;
	}

	public String getuPhonenumber() {
		return uPhonenumber;
	}

	public void setuPhonenumber(String uPhonenumber) {
		this.uPhonenumber = uPhonenumber;
	}

	public String getuEmail() {
		return uEmail;
	}

	public void setuEmail(String uEmail) {
		this.uEmail = uEmail;
	}
	
}
