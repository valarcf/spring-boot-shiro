package com.neo.sevice;

import com.neo.model.UserInfo;

public interface UserInfoService {

    public boolean regist(UserInfo userInfo);



    public  String getRandomString(int length);
}