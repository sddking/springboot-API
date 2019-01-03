package com.restore.demo.service;

import com.restore.demo.model.UserInfo;

import java.util.List;

public interface UserService {

    int addUser(UserInfo user);

    List<UserInfo> findAllUser(int pageNum, int pageSize);
}
