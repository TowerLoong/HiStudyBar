package com.hi.HiStudyBar.dao.pojo.information;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * 2018.1.26
 * @author Tower
 * 大学和它佩戴的标签的中间表所对应的实体类
 */
@Entity  
@Table(name = "t_univ_label")
public class UnivLabel {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO) 
	@Column(name = "univlabel_id")
	private Integer univlabelId;//主键
	
    @ManyToOne(optional = false)
    @JoinColumn(name="univ_id")
    private University university;//大学（外键）
	
	@ManyToOne(optional = false)
	@JoinColumn(name = "l_id")
	private Label label;//标签（外键）

	public UnivLabel() {
		super();
	}

	public UnivLabel(Integer univlabelId, University university, Label label) {
		super();
		this.univlabelId = univlabelId;
		this.university = university;
		this.label = label;
	}

	@Override
	public String toString() {
		return "UnivLabel [univlabelId=" + univlabelId + ", university=" + university + ", label=" + label + "]";
	}

	public Integer getUnivlabelId() {
		return univlabelId;
	}

	public void setUnivlabelId(Integer univlabelId) {
		this.univlabelId = univlabelId;
	}

	public University getUniversity() {
		return university;
	}

	public void setUniversity(University university) {
		this.university = university;
	}

	public Label getLabel() {
		return label;
	}

	public void setLabel(Label label) {
		this.label = label;
	}
	
}
