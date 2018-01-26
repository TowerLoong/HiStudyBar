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
@Table(name = "friend")
public class Friend {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO) 
	@Column(name = "friend_id")
	private Integer friendId;
	
	@ManyToOne(optional = true)
	@JoinColumn(name = "u_id1")
	private User user1;
	
	@ManyToOne(optional = true)
	@JoinColumn(name = "u_id2")
	private User user2;

	public Friend() {
		super();
	}

	public Friend(Integer friendId, User user1, User user2) {
		super();
		this.friendId = friendId;
		this.user1 = user1;
		this.user2 = user2;
	}

	@Override
	public String toString() {
		return "Friend [friendId=" + friendId + ", user1=" + user1 + ", user2=" + user2 + "]";
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
	
}
