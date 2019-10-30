package com.example.parkingserver.dao;

import com.example.parkingserver.entity.SysUserRoleVO;

import java.util.List;

/**
 * 用户角色表持久层
 *
 * @author zhouszxfs@xinfushe.com
 * @date 2019-10-30 14:51
 * @param
 * @return
 */
public interface SysUserRoleDao {

    /**
     * [新增]
     * @author zhousze
     * @date 2019/10/30
     **/
    int insert(SysUserRoleVO sysUserRole);

    /**
     * [刪除]
     * @author zhousze
     * @date 2019/10/30
     **/
    int delete(int id);

    /**
     * [更新]
     * @author zhousze
     * @date 2019/10/30
     **/
    int update(SysUserRoleVO sysUserRole);

    /**
     * [查詢] 根據主鍵 id 查詢
     * @author zhousze
     * @date 2019/10/30
     **/
    SysUserRoleVO load(int id);

    /**
     * [查詢] 分頁查詢
     * @author zhousze
     * @date 2019/10/30
     **/
    List<SysUserRoleVO> pageList(int offset, int pagesize);

    /**
     * [查詢] 分頁查詢 count
     * @author zhousze
     * @date 2019/10/30
     **/
    int pageListCount(int offset,int pagesize);
}
