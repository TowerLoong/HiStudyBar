package com.hi.HiStudyBar.dao.intf.information;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hi.HiStudyBar.dao.pojo.information.User;

@Repository
public interface IUserDao extends JpaRepository<User,Integer>{

}
