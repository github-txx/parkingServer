package com.example.parkingserver.entity;

import lombok.Data;

import java.util.Date;

/**
 * 车位基本信息表
 *
 * @param
 * @author zhouszxfs@xinfushe.com
 * @date 2019-10-29 16:46
 * @return
 */
@Data
public class BsParkingLotInfoVO {

    //主键
    private long id;

    //停车场ID
    private long parkingId;

    //车位编号
    private String code;

    //车位证编号
    private String lotNo;

    //车位所有人
    private long owner;

    //所有人联系电话
    private String ownerMobile;

    //车位估值
    private double valuation;

    //车位购入总价
    private double purchasePrice;

    //车位类型
    private long type;

    //购入时间
    private Date prrchaseTime;

    //车位当前状态
    private long status;

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
