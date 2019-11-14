package com.mdc.nacos.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.mdc.nacos.entity.Permission;

/**
 * 权限表
 *
 * @author yzjk code generator
 * @date 2019-11-01 00:13:11
 */
public interface PermissionMapper extends BaseMapper<Permission> {
    IPage<Permission>  selectmyList(Page page);
}
