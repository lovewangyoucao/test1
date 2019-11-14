package com.mdc.nacos.service.impl;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;

import com.mdc.nacos.entity.Permission;
import com.mdc.nacos.mapper.PermissionMapper;
import com.mdc.nacos.service.PermissionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 权限表
 *
 * @author yzjk code generator
 * @date 2019-11-01 00:13:11
 */
@Service
public class PermissionServiceImpl extends ServiceImpl<PermissionMapper, Permission> implements PermissionService {

}
