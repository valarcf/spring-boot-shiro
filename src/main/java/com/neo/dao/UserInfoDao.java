package com.neo.dao;

import com.neo.model.UserInfo;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Mapper
public interface UserInfoDao  {
    UserInfo get(Long userId);
    UserInfo find(String username);
    int save(UserInfo user);
    int update(UserInfo user);
    int remove(Long userId);
    List<UserInfo> list();

}