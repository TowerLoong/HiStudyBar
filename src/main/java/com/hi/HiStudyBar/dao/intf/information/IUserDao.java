package com.hi.HiStudyBar.dao.intf.information;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hi.HiStudyBar.dao.pojo.information.User;

/**
 * 2018.1.28
 * @author Tower
 * 操控User用户信息表的dao层接口
 */
@Repository
public interface IUserDao  extends JpaRepository<User,Integer>{

}
