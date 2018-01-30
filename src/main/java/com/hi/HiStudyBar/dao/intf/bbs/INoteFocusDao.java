package com.hi.HiStudyBar.dao.intf.bbs;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hi.HiStudyBar.dao.pojo.bbs.NoteFocus;

/**
 * 2018.1.28
 * @author Tower
 * 操控NoteFocus帖子关注表的dao层接口
 */
@Repository
public interface INoteFocusDao extends JpaRepository<NoteFocus,Integer>{

}
