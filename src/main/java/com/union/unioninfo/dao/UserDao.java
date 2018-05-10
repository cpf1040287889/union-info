package com.union.unioninfo.dao;

import com.union.unioninfo.entity.UserEntity;

public interface UserDao {

    int deleteByPrimaryKey(Integer id);

    int insert(UserEntity record);

    int insertSelective(UserEntity record);

    UserEntity selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(UserEntity record);

    int updateByPrimaryKey(UserEntity record);

}
