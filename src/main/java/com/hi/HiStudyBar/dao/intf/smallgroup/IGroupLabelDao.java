package com.hi.HiStudyBar.dao.intf.smallgroup;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hi.HiStudyBar.dao.pojo.smallgroup.GroupLabel;

/**
 * 2018.1.28
 * @author Tower
 * 操控GroupLabel群标签对应表的dao层接口
 */
@Repository
public interface IGroupLabelDao extends JpaRepository<GroupLabel,Integer>{

}
