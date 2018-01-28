package com.hi.HiStudyBar.dao.pojo.smallgroup;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.hi.HiStudyBar.dao.pojo.information.Label;

/**
 * 2018.1.27
 * @author Tower
 * 某讨论群和它所对应的标签的中间表的实体类
 * 即一个群有很多标签，一个标签也可以属于很多个群
 */
@Entity  
@Table(name = "t_group_label")
public class GroupLabel {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO) 
	@Column(name = "grouplabel_id")
	private Integer grouplabelId;
	
    @ManyToOne(optional = false)
    @JoinColumn(name="g_id")
    private Group group;//群（外键）
	
	@ManyToOne(optional = false)
	@JoinColumn(name = "l_id")//标签（外键）
	private Label label;

	public GroupLabel() {
		super();
	}

	public GroupLabel(Integer grouplabelId, Group group, Label label) {
		super();
		this.grouplabelId = grouplabelId;
		this.group = group;
		this.label = label;
	}

	@Override
	public String toString() {
		return "GroupLabel [grouplabelId=" + grouplabelId + ", group=" + group + ", label=" + label + "]";
	}

	public Integer getGrouplabelId() {
		return grouplabelId;
	}

	public void setGrouplabelId(Integer grouplabelId) {
		this.grouplabelId = grouplabelId;
	}

	public Group getGroup() {
		return group;
	}

	public void setGroup(Group group) {
		this.group = group;
	}

	public Label getLabel() {
		return label;
	}

	public void setLabel(Label label) {
		this.label = label;
	}
	
}
