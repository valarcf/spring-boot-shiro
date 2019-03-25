package com.neo.sevice.impl;

import com.neo.dao.UserInfoDao;
import com.neo.model.UserInfo;
import com.neo.sevice.UserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class UserInfoServiceImpl implements UserInfoService {
    @Autowired
    private UserInfoDao userInfoDao;

    @Override
    public boolean regist(UserInfo userInfo){
        return true;
    }
    private static String string = "abcdefghijklmnopqrstuvwxyz";

    @Override
    public  String getRandomString(int length){
        StringBuffer sb = new StringBuffer();
        int len = string.length();
        for (int i = 0; i < length; i++) {
            sb.append(string.charAt((int) Math.round(Math.random() * (len-1))));
        }
        return sb.toString();
    }
    @Override
    public UserInfo findByUsername(String username){
        return userInfoDao.find(username);
    }
}