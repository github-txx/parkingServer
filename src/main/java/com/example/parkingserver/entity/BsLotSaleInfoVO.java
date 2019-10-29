package com.example.parkingserver.entity;

import lombok.Data;

import java.util.Date;

/**
 * 车位销售信息表
 *
 * @param
 * @author zhouszxfs@xinfushe.com
 * @date 2019-10-29 17:09
 * @return
 */
@Data
public class BsLotSaleInfoVO {

    //主键
    private long id;

    //停车场ID
    private long parkingId;

    //车位ID
    private long parkingLotId;

    //认购人
    private long subscriber;

    //认购时间
    private Date subscriptionTime;

    //认购人电话
    private String subscriberMobile;

    //销售人
    private long saleman;

    //成交价格
    private double price;

    //车位位置图ID
    private String addrFileId;

    //车位证ID
    private String verifyFileId;

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
