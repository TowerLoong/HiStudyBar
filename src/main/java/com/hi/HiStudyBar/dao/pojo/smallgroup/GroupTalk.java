package com.hi.HiStudyBar.dao.pojo.smallgroup;

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
 * 用户在某群中聊天记录表对应的实体类
 */
@Entity  
@Table(name = "t_group_talk")
public class GroupTalk {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO) 
	@Column(name = "gt_id")
	private Integer gtId;
	
	@ManyToOne(optional = false)
	@JoinColumn(name = "u_id")
	private User user;//用户（外键）
	
    @ManyToOne(optional = false)
    @JoinColumn(name="g_id")
    private Group group;//群（外键）
	
    @Column(name = "gt_message" , length = 200)
	private String gtMessage;//单条聊天记录（不超过150字）
	
	@Column(name = "gt_time") 
	private Date gtTime;//聊天时间（精确到秒）

	public GroupTalk() {
		super();
	}

	public GroupTalk(Integer gtId, User user, Group group, String gtMessage, Date gtTime) {
		super();
		this.gtId = gtId;
		this.user = user;
		this.group = group;
		this.gtMessage = gtMessage;
		this.gtTime = gtTime;
	}

	@Override
	public String toString() {
		return "GroupTalk [gtId=" + gtId + ", user=" + user + ", group=" + group + ", gtMessage=" + gtMessage
				+ ", gtTime=" + gtTime + "]";
	}

	public Integer getGtId() {
		return gtId;
	}

	public void setGtId(Integer gtId) {
		this.gtId = gtId;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Group getGroup() {
		return group;
	}

	public void setGroup(Group group) {
		this.group = group;
	}

	public String getGtMessage() {
		return gtMessage;
	}

	public void setGtMessage(String gtMessage) {
		this.gtMessage = gtMessage;
	}

	public Date getGtTime() {
		return gtTime;
	}

	public void setGtTime(Date gtTime) {
		this.gtTime = gtTime;
	}
	
}
