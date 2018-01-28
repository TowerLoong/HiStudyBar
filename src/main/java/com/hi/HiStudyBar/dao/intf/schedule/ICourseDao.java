package com.hi.HiStudyBar.dao.intf.schedule;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hi.HiStudyBar.dao.pojo.schedule.Course;

/**
 * 2018.1.28
 * @author Tower
 * 操控Course的dao层接口
 */
@Repository
public interface ICourseDao extends JpaRepository<Course,Integer>{

}
