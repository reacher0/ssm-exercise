package com.reacher.mapper;

import com.reacher.entity.User;

import java.util.List;

public interface IUserMapper {
    List<User> selectAllUsers(User userFilter);
    void insertUser(User user);
    User selectOneUser(String userId);
}
