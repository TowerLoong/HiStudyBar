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
 * 用户和群的关系表对应的实体类
 * 即一个用户可以加入多个群，一个群也可以包含多个用户
 */
@Entity  
@Table(name = "t_user_group")
public class UserGroup {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO) 
	@Column(name = "usergroup_id")
	private Integer usergroupId;//主键
	
	@ManyToOne(optional = false)
	@JoinColumn(name = "u_id")
	private User user;//用户（外键）
	
	@ManyToOne(optional = false)
	@JoinColumn(name = "g_id")
	private Group group;//讨论群（外键）
	
	@Column(name = "usergroup_jointime") 
	private Date usergroupJointime;//用户加入群的时间（精确到秒）
	
	@Column(name = "usergroup_power" ,length = 20) 
	private String usergroupPower;//用户在群中的权限（“1”代表群主，“2”代表管理员，“3”代表普通群员）

	public UserGroup() {
		super();
	}

	public UserGroup(Integer usergroupId, User user, Group group, Date usergroupJointime, String usergroupPower) {
		super();
		this.usergroupId = usergroupId;
		this.user = user;
		this.group = group;
		this.usergroupJointime = usergroupJointime;
		this.usergroupPower = usergroupPower;
	}

	@Override
	public String toString() {
		return "UserGroup [usergroupId=" + usergroupId + ", user=" + user + ", group=" + group + ", usergroupJointime="
				+ usergroupJointime + ", usergroupPower=" + usergroupPower + "]";
	}

	public Integer getUsergroupId() {
		return usergroupId;
	}

	public void setUsergroupId(Integer usergroupId) {
		this.usergroupId = usergroupId;
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

	public Date getUsergroupJointime() {
		return usergroupJointime;
	}

	public void setUsergroupJointime(Date usergroupJointime) {
		this.usergroupJointime = usergroupJointime;
	}

	public String getUsergroupPower() {
		return usergroupPower;
	}

	public void setUsergroupPower(String usergroupPower) {
		this.usergroupPower = usergroupPower;
	}
	
}
