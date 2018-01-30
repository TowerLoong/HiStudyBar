package com.hi.HiStudyBar.dao.intf.schedule;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hi.HiStudyBar.dao.pojo.schedule.CourseSchedule;

/**
 * 2018.1.28
 * @author Tower
 * 操控CourseSchedule课程表信息表的dao层接口
 */
@Repository
public interface ICourseScheduleDao extends JpaRepository<CourseSchedule,Integer>{

}
