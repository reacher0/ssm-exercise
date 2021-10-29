package com.reacher.controller;

import com.github.pagehelper.PageInfo;
import com.reacher.entity.User;
import com.reacher.service.IUserService;
import com.reacher.util.IAddMark;
import com.reacher.util.ResultVo;
import com.reacher.util.ISelectMark;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;


@RequestMapping("/users")
@RestController
public class UserController {

    @Autowired
    private IUserService userService;

    @GetMapping("")
    public ResultVo queryUser(@Validated(value = {ISelectMark.class}) User user, @RequestParam(required = false,defaultValue = "1") int pageNum, @RequestParam(required = false,defaultValue = "3") int pageSize){
        PageInfo<User> users = userService.findAllUsers(user,pageNum, pageSize);
        return ResultVo.success(users);
    }

    @PostMapping("")
    public void addUser(@Validated(value = {IAddMark.class}) @RequestBody User user){
        System.out.println("before: user = [" + user + "]");
        userService.createUser(user);
        System.out.println("after: user = " + user);
    }

    @GetMapping("/{userId}")
    public User queryOneUser(@PathVariable String userId){
        return userService.findOneUser(userId);
    }
}
