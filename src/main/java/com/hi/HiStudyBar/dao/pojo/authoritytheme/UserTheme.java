package com.hi.HiStudyBar.dao.pojo.authoritytheme;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.hi.HiStudyBar.dao.pojo.information.User;

/**
 * 2018.1.27
 * @author Tower
 * 用户加入话题的中间表所对应的实体类
 */
@Entity  
@Table(name = "t_user_theme")
public class UserTheme {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO) 
	@Column(name = "usertheme_id")
	private Integer userthemeId;
	
	@ManyToOne(optional = false)
	@JoinColumn(name = "u_id")
	private User user;//用户（外键）
	
	@ManyToOne(optional = false)
	@JoinColumn(name = "t_id")
	private Theme theme;//话题（外键）
	
	@Column(name = "usertheme_jointime") 
	private Date userthemeJointime;//用户加入话题的时间（精确到秒）
	
	@Column(name = "usertheme_power" ,length = 20) 
	private String userthemePower;//用户在话题中的权限（“1”代表群主，“2”代表管理员，“3”代表普通群员）

	public UserTheme() {
		super();
	}

	public UserTheme(Integer userthemeId, User user, Theme theme, Date userthemeJointime, String userthemePower) {
		super();
		this.userthemeId = userthemeId;
		this.user = user;
		this.theme = theme;
		this.userthemeJointime = userthemeJointime;
		this.userthemePower = userthemePower;
	}

	@Override
	public String toString() {
		return "UserTheme [userthemeId=" + userthemeId + ", user=" + user + ", theme=" + theme + ", userthemeJointime="
				+ userthemeJointime + ", userthemePower=" + userthemePower + "]";
	}

	public Integer getUserthemeId() {
		return userthemeId;
	}

	public void setUserthemeId(Integer userthemeId) {
		this.userthemeId = userthemeId;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Theme getTheme() {
		return theme;
	}

	public void setTheme(Theme theme) {
		this.theme = theme;
	}

	public Date getUserthemeJointime() {
		return userthemeJointime;
	}

	public void setUserthemeJointime(Date userthemeJointime) {
		this.userthemeJointime = userthemeJointime;
	}

	public String getUserthemePower() {
		return userthemePower;
	}

	public void setUserthemePower(String userthemePower) {
		this.userthemePower = userthemePower;
	}
	
}
