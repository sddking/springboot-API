package com.restore.demo.service;

import com.github.pagehelper.PageHelper;
import com.restore.demo.mapper.UserInfoMapper;
import com.restore.demo.model.UserInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service(value = "UserService")
public class UserServiceImpl implements UserService {
    @Autowired
    private UserInfoMapper userInfoMapper;

    @Override
    public int addUser(UserInfo user) {
        return userInfoMapper.insertSelective(user);
    }

    @Override
    public List<UserInfo> findAllUser(int pageNum, int pageSize) {
        PageHelper.startPage(pageNum, pageSize);
        return userInfoMapper.selectAllUser();
    }
}
