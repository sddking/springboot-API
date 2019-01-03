package com.restore.demo.controller;

import com.restore.demo.model.UserInfo;
import com.restore.demo.service.UserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;


@Controller
@RequestMapping("/user")
@Api("User API includes CURD")
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping(value = "/add",produces = {"application/json;charset=UTF-8"},method = RequestMethod.POST)
    @ResponseBody
    @ApiOperation("Add a user by Class")
    public int addUser(@RequestBody UserInfo user){
        return userService.addUser(user);
    }

    @RequestMapping(value = "/all/{pageNum}/{pageSize}",method = RequestMethod.GET)
    @ResponseBody
    @ApiOperation("findAllUser by pageNum,pageSize")
    public Object findAllUser(@PathVariable("pageNum") int pageNum, @PathVariable("pageSize") int pageSize){
        return userService.findAllUser(pageNum,pageSize);
    }
}
