package com.dong.common.dao;

import com.dong.common.model.User;
import com.dong.common.model.UserExample;
import java.util.List;

public interface UserMapper {
    long countByExample(UserExample example);

    int deleteByPrimaryKey(Long id);

    int insert(User record);

    int insertSelective(User record);

    List<User> selectByExample(UserExample example);

    User selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);
}