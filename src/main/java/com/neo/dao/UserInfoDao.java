package com.neo.dao;

import com.neo.model.UserInfo;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Repository
@Mapper
public interface UserInfoDao  {

    UserInfo get(Long userId);
    int save(UserInfo user);

    int update(UserInfo user);

    int remove(Long userId);

}