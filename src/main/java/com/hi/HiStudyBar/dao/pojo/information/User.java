package com.hi.HiStudyBar.dao.pojo.information;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity  
@Table(name = "user")
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO) 
	private Integer uId;
	
	@Column(name = "u_name", nullable = false) 
	private String uName;
	
	@Column(name = "u_password", nullable = false) 
	private String uPassword;
	
	@Column(name = "u_true_name") 
	private String uTrueName;
	
	@Column(name = "u_sex") 
	private String uSex;
	
	@Column(name = "u_head_pic") 
	private String uHeadPic;
	
	 // 多对一：optional=false表示外键不能为空
	@ManyToOne(optional = true)
	@JoinColumn(name = "univ_id")
	private University university;
	
	@Column(name = "u_institute") 
	private String uInstitute;
	
	@Column(name = "u_magor") 
	private String uMagor;
	
	@Column(name = "u_phonenumber") 
	private String uPhonenumber;
	
	@Column(name = "u_email") 
	private String uEmail;

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
