package com.hi.HiStudyBar.dao.intf.adminthing;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hi.HiStudyBar.dao.pojo.adminthing.Admin;

/**
 * 2018.1.28
 * @author Tower
 * 操控Admin的dao层接口
 */
@Repository
public interface IAdminDao extends JpaRepository<Admin,Integer>{

}
