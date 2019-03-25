package com.neo.dao;

import com.neo.model.UserInfo;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Component(value = "userMapper")
public interface UserInfoDao  {
    @Select("select * from user_Info u where uid=#{userId}")
    UserInfo get(Integer userId);
    @Select("select * from user_Info u where username=#{username}")
    UserInfo find(String username);
    int save(UserInfo user);
    int update(UserInfo user);
    int remove(Long userId);
    List<UserInfo> list();

}