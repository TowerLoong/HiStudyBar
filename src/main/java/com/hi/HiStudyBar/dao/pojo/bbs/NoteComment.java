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
 * 帖子的评论表对应的实体类
 * 注意：“评论”和“回复”都放在这个表，然后用nc_iscomment这个属性来区分
 */
@Entity  
@Table(name = "t_note_comment")
public class NoteComment {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO) 
	@Column(name = "nc_id")
	private Integer ncId;//主键
	
	@ManyToOne(optional = false)
	@JoinColumn(name = "u_id")
	private User user;//用户（外键）
	
	@ManyToOne(optional = false)
	@JoinColumn(name = "b_id")
	private BbsNote bbsNote;//帖子（外键）
	
	@ManyToOne(optional = true)
	@JoinColumn(name = "nc_parent_id")
	private NoteComment parentComment;//回复的那条评论（只有“回复”才有这一项，“评论”的这一项为空）
	
	@Column(name = "nc_iscomment" , nullable = false , length = 10)
	private String ncIscomment;//这条信息是否是评论（“Y”表示是评论,"N"表示是回复，不能为空）
	
	@Column(name = "nc_message" , nullable = false , length = 255)
	private String ncMessage;//回复的具体信息（少于200字符，不能为空）
	
	@Column(name = "nc_time" , nullable = false) 
	private Date ncTime;//评论（回复）时间（精确到秒）（不能为空）
	
	@Column(name = "nc_like_num") 
	private Integer ncLikeNum;//这条评论（回复）的点赞数目
	
	@Column(name = "nc_comment_num") 
	private Integer ncCommentNum;//这条评论下面的回复数目

	public NoteComment() {
		super();
	}

	public NoteComment(Integer ncId, User user, BbsNote bbsNote, NoteComment parentComment, String ncIscomment,
			String ncMessage, Date ncTime, Integer ncLikeNum, Integer ncCommentNum) {
		super();
		this.ncId = ncId;
		this.user = user;
		this.bbsNote = bbsNote;
		this.parentComment = parentComment;
		this.ncIscomment = ncIscomment;
		this.ncMessage = ncMessage;
		this.ncTime = ncTime;
		this.ncLikeNum = ncLikeNum;
		this.ncCommentNum = ncCommentNum;
	}

	@Override
	public String toString() {
		return "NoteComment [ncId=" + ncId + ", user=" + user + ", bbsNote=" + bbsNote + ", parentComment="
				+ parentComment + ", ncIscomment=" + ncIscomment + ", ncMessage=" + ncMessage + ", ncTime=" + ncTime
				+ ", ncLikeNum=" + ncLikeNum + ", ncCommentNum=" + ncCommentNum + "]";
	}

	public Integer getNcId() {
		return ncId;
	}

	public void setNcId(Integer ncId) {
		this.ncId = ncId;
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

	public NoteComment getParentComment() {
		return parentComment;
	}

	public void setParentComment(NoteComment parentComment) {
		this.parentComment = parentComment;
	}

	public String getNcIscomment() {
		return ncIscomment;
	}

	public void setNcIscomment(String ncIscomment) {
		this.ncIscomment = ncIscomment;
	}

	public String getNcMessage() {
		return ncMessage;
	}

	public void setNcMessage(String ncMessage) {
		this.ncMessage = ncMessage;
	}

	public Date getNcTime() {
		return ncTime;
	}

	public void setNcTime(Date ncTime) {
		this.ncTime = ncTime;
	}

	public Integer getNcLikeNum() {
		return ncLikeNum;
	}

	public void setNcLikeNum(Integer ncLikeNum) {
		this.ncLikeNum = ncLikeNum;
	}

	public Integer getNcCommentNum() {
		return ncCommentNum;
	}

	public void setNcCommentNum(Integer ncCommentNum) {
		this.ncCommentNum = ncCommentNum;
	}
	
}
