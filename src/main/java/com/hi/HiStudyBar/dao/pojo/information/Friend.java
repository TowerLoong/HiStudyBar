package com.hi.HiStudyBar.dao.pojo.information;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * 2018.1.27(snowy)
 * @author Tower
 * 好友关系表对应的实体类
 */
@Entity  
@Table(name = "t_friend")
public class Friend {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO) 
	@Column(name = "f_id")
	private Integer friendId;//主键
	
	@ManyToOne(optional = false)
	@JoinColumn(name = "u_id1")
	private User user1;//用户1（外键，它和后面的用户2互为好友）
	
	@ManyToOne(optional = false)
	@JoinColumn(name = "u_id2")
	private User user2;//用户2（外键，它和前面的用户1互为好友）
	
	@Column(name = "f_begintime") 
	private Date fBegintime;//加为好友的时间（精确到天）

	public Friend() {
		super();
	}

	public Friend(Integer friendId, User user1, User user2, Date fBegintime) {
		super();
		this.friendId = friendId;
		this.user1 = user1;
		this.user2 = user2;
		this.fBegintime = fBegintime;
	}

	@Override
	public String toString() {
		return "Friend [friendId=" + friendId + ", user1=" + user1 + ", user2=" + user2 + ", fBegintime=" + fBegintime
				+ "]";
	}

	public Integer getFriendId() {
		return friendId;
	}

	public void setFriendId(Integer friendId) {
		this.friendId = friendId;
	}

	public User getUser1() {
		return user1;
	}

	public void setUser1(User user1) {
		this.user1 = user1;
	}

	public User getUser2() {
		return user2;
	}

	public void setUser2(User user2) {
		this.user2 = user2;
	}

	public Date getfBegintime() {
		return fBegintime;
	}

	public void setfBegintime(Date fBegintime) {
		this.fBegintime = fBegintime;
	}
	
}
