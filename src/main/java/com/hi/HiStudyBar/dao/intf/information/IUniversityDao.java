package com.hi.HiStudyBar.dao.intf.information;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hi.HiStudyBar.dao.pojo.information.University;

/**
 * 2018.1.28
 * @author Tower
 * 操控University大学信息表的dao层接口
 */
@Repository
public interface IUniversityDao extends JpaRepository<University,Integer>{

}
