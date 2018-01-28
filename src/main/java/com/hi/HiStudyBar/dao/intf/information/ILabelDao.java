package com.hi.HiStudyBar.dao.intf.information;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hi.HiStudyBar.dao.pojo.information.Label;

/**
 * 2018.1.28
 * @author Tower
 * 操控Label的dao层接口
 */
@Repository
public interface ILabelDao extends JpaRepository<Label,Integer>{

}
