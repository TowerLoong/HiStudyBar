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
 * 官方话题中的对话表所对应的实体类
 */
@Entity  
@Table(name = "t_theme_talk")
public class ThemeTalk {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO) 
	@Column(name = "tt_id")
	private Integer ttId;
	
	@ManyToOne(optional = false)
	@JoinColumn(name = "u_id")
	private User user;//用户（外键）
	
	@ManyToOne(optional = false)
	@JoinColumn(name = "t_id")
	private Theme theme;//话题（外键）
	
    @Column(name = "tt_message" , length = 200)
	private String ttMessage;//单条聊天记录（不超过150字）
	
	@Column(name = "tt_time") 
	private Date ttTime;//聊天时间（精确到秒）

	public ThemeTalk() {
		super();
	}

	public ThemeTalk(Integer ttId, User user, Theme theme, String ttMessage, Date ttTime) {
		super();
		this.ttId = ttId;
		this.user = user;
		this.theme = theme;
		this.ttMessage = ttMessage;
		this.ttTime = ttTime;
	}

	@Override
	public String toString() {
		return "ThemeTalk [ttId=" + ttId + ", user=" + user + ", theme=" + theme + ", ttMessage=" + ttMessage
				+ ", ttTime=" + ttTime + "]";
	}

	public Integer getTtId() {
		return ttId;
	}

	public void setTtId(Integer ttId) {
		this.ttId = ttId;
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

	public String getTtMessage() {
		return ttMessage;
	}

	public void setTtMessage(String ttMessage) {
		this.ttMessage = ttMessage;
	}

	public Date getTtTime() {
		return ttTime;
	}

	public void setTtTime(Date ttTime) {
		this.ttTime = ttTime;
	}
	
}
