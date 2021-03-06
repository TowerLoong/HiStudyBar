package com.hi.HiStudyBar.dao.intf.smallgroup;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hi.HiStudyBar.dao.pojo.smallgroup.UserGroup;

/**
 * 2018.1.28
 * @author Tower
 * 操控UserGroup用户和群关系表的dao层接口
 */
@Repository
public interface IUserGroupDao extends JpaRepository<UserGroup,Integer>{

}
