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
 * 用户佩戴的标签的中间表所对应的实体类
 */
@Entity  
@Table(name = "t_user_label")
public class UserLabel {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO) 
	@Column(name="userlabel_id")
	private Integer userlabelId;//主键
	
	@ManyToOne(optional = true)
	@JoinColumn(name = "u_id")
	private User user;//用户（外键）
	
	@ManyToOne(optional = true)
	@JoinColumn(name = "l_id")
	private Label label;//标签（外键）

	public UserLabel() {
		super();
	}

	public UserLabel(Integer userlabelId, User user, Label label) {
		super();
		this.userlabelId = userlabelId;
		this.user = user;
		this.label = label;
	}

	@Override
	public String toString() {
		return "UserLabel [userlabelId=" + userlabelId + ", user=" + user + ", label=" + label + "]";
	}

	public Integer getUserlabelId() {
		return userlabelId;
	}

	public void setUserlabelId(Integer userlabelId) {
		this.userlabelId = userlabelId;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Label getLabel() {
		return label;
	}

	public void setLabel(Label label) {
		this.label = label;
	}
	
}


