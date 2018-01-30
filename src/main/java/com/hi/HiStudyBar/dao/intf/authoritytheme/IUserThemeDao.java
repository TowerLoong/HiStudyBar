package com.hi.HiStudyBar.dao.intf.authoritytheme;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hi.HiStudyBar.dao.pojo.authoritytheme.UserTheme;

/**
 * 2018.1.28
 * @author Tower
 * 操控UserTheme用户话题关系表的dao层接口
 */
@Repository
public interface IUserThemeDao extends JpaRepository<UserTheme,Integer>{

}
