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
 * 2018.1.27
 * @author Tower
 * 帖子表对应的实体类
 */
@Entity  
@Table(name = "t_bbs_note")
public class BbsNote {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO) 
	@Column(name = "b_id")
	private Integer bId;//主键
	
	@ManyToOne(optional = false)
	@JoinColumn(name = "u_id")
	private User user;//用户（外键）
	
	@Column(name = "b_title" , nullable = false , length = 50) 
	private String bTitle;//帖子标题（少于30字符，不能为空）
	
	@Column(name = "b_description" , nullable = false , length = 255) 
	private String bDescription;//（少于200字符，不能为空）
	
	@ManyToOne(optional = false)
	@JoinColumn(name = "nt_id")
	private NoteType noteType;//帖子类型（外键）
	
	@Column(name = "b_time") 
	private Date bTime;//发帖时间（精确到秒）
	
	@Column(name = "b_like_num") 
	private Integer bLikeNum;//点赞数目
	
	@Column(name = "b_comment_num") 
	private Integer bCommentNum;//评论数目
	
	@Column(name = "b_focus_num") 
	private Integer bFocusNum;//关注数目

	public BbsNote() {
		super();
	}

	public BbsNote(Integer bId, User user, String bTitle, String bDescription, NoteType noteType, Date bTime,
			Integer bLikeNum, Integer bCommentNum, Integer bFocusNum) {
		super();
		this.bId = bId;
		this.user = user;
		this.bTitle = bTitle;
		this.bDescription = bDescription;
		this.noteType = noteType;
		this.bTime = bTime;
		this.bLikeNum = bLikeNum;
		this.bCommentNum = bCommentNum;
		this.bFocusNum = bFocusNum;
	}
	
	@Override
	public String toString() {
		return "BbsNote [bId=" + bId + ", user=" + user + ", bTitle=" + bTitle + ", bDescription=" + bDescription
				+ ", noteType=" + noteType + ", bTime=" + bTime + ", bLikeNum=" + bLikeNum + ", bCommentNum="
				+ bCommentNum + ", bFocusNum=" + bFocusNum + "]";
	}

	public Integer getbId() {
		return bId;
	}

	public void setbId(Integer bId) {
		this.bId = bId;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public String getbTitle() {
		return bTitle;
	}

	public void setbTitle(String bTitle) {
		this.bTitle = bTitle;
	}

	public String getbDescription() {
		return bDescription;
	}

	public void setbDescription(String bDescription) {
		this.bDescription = bDescription;
	}

	public NoteType getNoteType() {
		return noteType;
	}

	public void setNoteType(NoteType noteType) {
		this.noteType = noteType;
	}

	public Date getbTime() {
		return bTime;
	}

	public void setbTime(Date bTime) {
		this.bTime = bTime;
	}

	public Integer getbLikeNum() {
		return bLikeNum;
	}

	public void setbLikeNum(Integer bLikeNum) {
		this.bLikeNum = bLikeNum;
	}

	public Integer getbCommentNum() {
		return bCommentNum;
	}

	public void setbCommentNum(Integer bCommentNum) {
		this.bCommentNum = bCommentNum;
	}

	public Integer getbFocusNum() {
		return bFocusNum;
	}

	public void setbFocusNum(Integer bFocusNum) {
		this.bFocusNum = bFocusNum;
	}
	
}
