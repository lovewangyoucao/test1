package com.mdc.nacos.controller;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.mdc.nacos.entity.MyTest1;
import com.mdc.nacos.entity.Permission;
import com.mdc.nacos.mapper.PermissionMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/permission")
public class TestController {
    @Autowired
    private PermissionMapper permissionMapper;
    @PostMapping("/list")
    public IPage<Permission> removeById(@RequestBody MyTest1 myTest1){
        Page<Permission> permissions = new Page<Permission>(1,30);
        IPage<Permission> permissionIPage = permissionMapper.selectmyList(permissions);
        return permissionIPage;
    }
}
