package com.hi.HiStudyBar.dao.intf.bbs;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hi.HiStudyBar.dao.pojo.bbs.BbsNote;

/**
 * 2018.1.28
 * @author Tower
 * 操控BbsNote帖子表的dao层接口
 */
@Repository
public interface IBbsNoteDao extends JpaRepository<BbsNote,Integer>{

}
