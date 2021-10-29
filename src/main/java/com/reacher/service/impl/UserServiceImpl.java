package com.reacher.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.reacher.entity.User;
import com.reacher.mapper.IUserMapper;
import com.reacher.service.IUserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements IUserService {

    Logger logger = LoggerFactory.getLogger(UserServiceImpl.class);

    @Autowired
    private IUserMapper userMapper;

    @Override
    public PageInfo<User> findAllUsers(User userFilter,int pageNum, int pageSize) {
        PageHelper.startPage(pageNum,pageSize);
        List<User> users = userMapper.selectAllUsers(userFilter);
        return new PageInfo<>(users);
    }

    @Override
    public void createUser(User user) {
        logger.info("新建User");
        logger.info("前端返回User:"+user);
        userMapper.insertUser(user);
        logger.info("新增完成,数据库User:"+user);
    }

    @Override
    public User findOneUser(String userId) {
        return userMapper.selectOneUser(userId);
    }
}
