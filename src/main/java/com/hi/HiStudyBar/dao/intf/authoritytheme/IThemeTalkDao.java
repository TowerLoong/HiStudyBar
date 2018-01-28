package com.hi.HiStudyBar.dao.intf.authoritytheme;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hi.HiStudyBar.dao.pojo.authoritytheme.ThemeTalk;

/**
 * 2018.1.28
 * @author Tower
 * 操控ThemeTalk的dao层接口
 */
@Repository
public interface IThemeTalkDao extends JpaRepository<ThemeTalk,Integer>{

}
