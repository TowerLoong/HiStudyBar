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
 * 群公告表对应的实体类
 */
@Entity  
@Table(name = "t_notice")
public class Notice {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO) 
	@Column(name = "n_id")
	private Integer nId;
	
	@ManyToOne(optional = false)
	@JoinColumn(name = "u_id")
	private User user;//发布公告的用户（外键）
	
    @ManyToOne(optional = false)
    @JoinColumn(name="g_id")
    private Group group;//发布公告的群（外键）
	
    @Column(name = "n_title" , length = 30)
	private String nTitle;//公告的标题（不超过20个字符）
    
    @Column(name = "n_message" , length = 200)
 	private String nMessage;//公告详情（不超过150字符）
	
	@Column(name = "n_time") 
	private Date nTime;//公告发布时间（精确到秒）

	public Notice() {
		super();
	}

	public Notice(Integer nId, User user, Group group, String nTitle, String nMessage, Date nTime) {
		super();
		this.nId = nId;
		this.user = user;
		this.group = group;
		this.nTitle = nTitle;
		this.nMessage = nMessage;
		this.nTime = nTime;
	}

	@Override
	public String toString() {
		return "Notice [nId=" + nId + ", user=" + user + ", group=" + group + ", nTitle=" + nTitle + ", nMessage="
				+ nMessage + ", nTime=" + nTime + "]";
	}

	public Integer getnId() {
		return nId;
	}

	public void setnId(Integer nId) {
		this.nId = nId;
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

	public String getnTitle() {
		return nTitle;
	}

	public void setnTitle(String nTitle) {
		this.nTitle = nTitle;
	}

	public String getnMessage() {
		return nMessage;
	}

	public void setnMessage(String nMessage) {
		this.nMessage = nMessage;
	}

	public Date getnTime() {
		return nTime;
	}

	public void setnTime(Date nTime) {
		this.nTime = nTime;
	}
	
}
