package com.restore.demo.mapper;

import com.restore.demo.model.UserInfo;
import com.restore.demo.model.UserInfoKey;

import java.util.List;

public interface UserInfoMapper {
    int deleteByPrimaryKey(UserInfoKey key);

    int insert(UserInfo record);

    int insertSelective(UserInfo record);

    UserInfo selectByPrimaryKey(UserInfoKey key);

    int updateByPrimaryKeySelective(UserInfo record);

    int updateByPrimaryKey(UserInfo record);

    List<UserInfo> selectAllUser();
}