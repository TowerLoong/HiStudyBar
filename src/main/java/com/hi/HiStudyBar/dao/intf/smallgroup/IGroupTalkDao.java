package com.hi.HiStudyBar.dao.intf.smallgroup;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hi.HiStudyBar.dao.pojo.smallgroup.GroupTalk;

/**
 * 2018.1.28
 * @author Tower
 * 操控GroupTalk的dao层接口
 */
@Repository
public interface IGroupTalkDao extends JpaRepository<GroupTalk,Integer>{

}
