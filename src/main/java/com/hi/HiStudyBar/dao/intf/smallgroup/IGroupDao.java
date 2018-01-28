package com.hi.HiStudyBar.dao.intf.smallgroup;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hi.HiStudyBar.dao.pojo.smallgroup.Group;

/**
 * 2018.1.28
 * @author Tower
 * 操控Group的dao层接口
 */
@Repository
public interface IGroupDao extends JpaRepository<Group,Integer>{

}

