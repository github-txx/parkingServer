package com.example.parkingserver.entity;

import lombok.Data;

import java.util.Date;

/**
 * 角色表
 *
 * @author zhouszxfs@xinfushe.com
 * @date 2019-10-29 18:50
 * @param
 * @return
 */
@Data
public class SysUserRoleVO {

    //主键
    private long id;

    //角色名称
    private String roleName;

    //角色编码
    private String roleCode;

    //创建人
    private long createBy;

    //创建时间
    private Date createDt;

    //创建人姓名
    private String createName;

    //修改人
    private long modifyBy;

    //修改时间
    private Date modifyDt;

    //修改人姓名
    private String modifyName;

    //是否删除
    private long dr = 0;
}
