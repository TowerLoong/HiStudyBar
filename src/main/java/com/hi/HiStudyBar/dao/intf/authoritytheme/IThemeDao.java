package com.hi.HiStudyBar.dao.intf.authoritytheme;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hi.HiStudyBar.dao.pojo.authoritytheme.Theme;

/**
 * 2018.1.28
 * @author Tower
 * 操控Theme官方话题表的dao层接口
 */
@Repository
public interface IThemeDao extends JpaRepository<Theme,Integer>{

	
}
