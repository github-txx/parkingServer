package com.example.parkingserver.entity;

import lombok.Data;

import java.util.Date;

/**
 * 月租车信息表
 *
 * @author zhouszxfs@xinfushe.com
 * @date 2019-10-29 17:13
 * @param
 * @return
 */
@Data
public class BsLotLeaseInfoVO {

    //主键
    private long id;

    //停车场ID
    private long parkingId;

    //车位ID
    private long parkingLotId;

    //租赁人
    private long leaseUser;

    //租赁人电话
    private String leaseUserMobile;

    //租赁人住址
    private String leaseUserAddr;

    //租赁时间
    private Date leaseTime;

    //租赁类型（0：月租，1：季租，2：年租）
    private long type;

    //租赁周期
    private String leasePeriod;

    //租金单价
    private double leasePrice;

    //租赁人车牌号
    private String leaseCarNo;

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
