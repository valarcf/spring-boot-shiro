package com.neo.dao;

import com.neo.model.UserInfo;

@Mapper
public interface UserInfoDao  {

    UserInfo get(Long userId);
    int save(UserInfo user);

    int update(UserInfo user);

    int remove(Long userId);

}