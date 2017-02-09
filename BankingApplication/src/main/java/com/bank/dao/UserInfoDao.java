package com.bank.dao;

import java.util.List;

import com.bank.model.UserInfo;

public interface UserInfoDao {
public void save(UserInfo Userinfo );
public void retrive();
List <UserInfo> getUserData();

}
