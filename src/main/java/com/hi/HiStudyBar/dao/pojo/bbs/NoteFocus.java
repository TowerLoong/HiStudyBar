package com.hi.HiStudyBar.dao.pojo.bbs;

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
 * 2018.1.28
 * @author Tower
 * 用户关注帖子的中间表对应的实体类
 */
@Entity  
@Table(name = "t_note_focus")
public class NoteFocus {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO) 
	@Column(name = "notefocus_id")
	private Integer notefocusId;//主键
	
	@ManyToOne(optional = false)
	@JoinColumn(name = "u_id")
	private User user;//用户（外键）
	
	@ManyToOne(optional = false)
	@JoinColumn(name = "b_id")
	private BbsNote bbsNote;//帖子（外键）
	
	@Column(name = "notefocus_time" , nullable = false) 
	private Date notefocusTime;//用户关注帖子的时间

	public NoteFocus() {
		super();
	}

	public NoteFocus(Integer notefocusId, User user, BbsNote bbsNote, Date notefocusTime) {
		super();
		this.notefocusId = notefocusId;
		this.user = user;
		this.bbsNote = bbsNote;
		this.notefocusTime = notefocusTime;
	}

	@Override
	public String toString() {
		return "NoteFocus [notefocusId=" + notefocusId + ", user=" + user + ", bbsNote=" + bbsNote + ", notefocusTime="
				+ notefocusTime + "]";
	}

	public Integer getNotefocusId() {
		return notefocusId;
	}

	public void setNotefocusId(Integer notefocusId) {
		this.notefocusId = notefocusId;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public BbsNote getBbsNote() {
		return bbsNote;
	}

	public void setBbsNote(BbsNote bbsNote) {
		this.bbsNote = bbsNote;
	}

	public Date getNotefocusTime() {
		return notefocusTime;
	}

	public void setNotefocusTime(Date notefocusTime) {
		this.notefocusTime = notefocusTime;
	}
	
}
