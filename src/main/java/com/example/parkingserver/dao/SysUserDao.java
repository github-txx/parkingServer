package com.example.parkingserver.dao;

import com.example.parkingserver.entity.SysUserVO;

import java.util.List;

/**
 * 用户表持久层
 *
 * @author zhouszxfs@xinfushe.com
 * @date 2019-10-30 14:52
 * @param
 * @return
 */
public interface SysUserDao {

    /**
     * [新增]
     * @author zhousze
     * @date 2019/10/30
     **/
    int insert(SysUserVO sysUser);

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
    int update(SysUserVO sysUser);

    /**
     * [查詢] 根據主鍵 id 查詢
     * @author zhousze
     * @date 2019/10/30
     **/
    SysUserVO load(int id);

    /**
     * [查詢] 分頁查詢
     * @author zhousze
     * @date 2019/10/30
     **/
    List<SysUserVO> pageList(int offset, int pagesize);

    /**
     * [查詢] 分頁查詢 count
     * @author zhousze
     * @date 2019/10/30
     **/
    int pageListCount(int offset,int pagesize);
}
