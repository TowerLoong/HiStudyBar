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

@Entity  
@Table(name = "friend")
public class Friend {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO) 
	@Column(name = "f_id")
	private Integer friendId;
	
	@ManyToOne(optional = true)
	@JoinColumn(name = "u_id1")
	private User user1;
	
	@ManyToOne(optional = true)
	@JoinColumn(name = "u_id2")
	private User user2;
	
	@Column(name = "f_begintime") 
	private Date f_begintime;

	public Friend() {
		super();
	}

	
	
}
