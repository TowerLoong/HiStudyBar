package com.hi.HiStudyBar.dao.intf.bbs;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hi.HiStudyBar.dao.pojo.bbs.NoteComment;

/**
 * 2018.1.28
 * @author Tower
 * 操控NoteComment的dao层接口
 */
@Repository
public interface INoteCommentDao extends JpaRepository<NoteComment,Integer>{

}
