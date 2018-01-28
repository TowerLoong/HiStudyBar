package com.hi.HiStudyBar.dao.intf.information;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hi.HiStudyBar.dao.pojo.information.UserLabel;

/**
 * 2018.1.28
 * @author Tower
 * 操控UserLabel的dao层接口
 */
@Repository
public interface IUserLabelDao extends JpaRepository<UserLabel,Integer>{

}
