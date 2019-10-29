package com.example.parkingserver.entity;

import lombok.Data;

import java.util.Date;

/**
 * 用户表
 *
 * @author zhouszxfs@xinfushe.com
 * @date 2019-10-29 18:50
 * @param
 * @return
 */
@Data
public class SysUserVO {

    //主键
    private long id;

    //角色ID
    private long roleId;

    //用户名
    private String userName;

    //真实名
    private String realName;

    //密码
    private String password = "1";

    //头像
    private String smallImage;

    //电子邮件
    private String email;

    //电话号码
    private String phone;

    //手机号
    private String mobile;

    //QQ
    private String qq;

    //MSN
    private String msn;

    //最后登录时间
    private Date lastLoginDt;

    //用户类型（0：管理员，1：普通用户）
    private long userType;

    //备注
    private String remark;

    //身份证号码
    private String identityCode;

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
