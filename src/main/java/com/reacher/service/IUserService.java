package com.reacher.service;

import com.github.pagehelper.PageInfo;
import com.reacher.entity.User;



public interface IUserService {
    PageInfo<User> findAllUsers(User userFilter,int pageNum, int pageSize);
    void createUser(User user);
    User findOneUser(String userId);
}
