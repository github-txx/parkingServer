package com.example.parkingserver.entity;

import lombok.Data;

import java.util.Date;

/**
 * 车位日志表
 *
 * @author zhouszxfs@xinfushe.com
 * @date 2019-10-29 17:15
 * @param
 * @return
 */
@Data
public class BsLotLogInfoVO {

    //主键
    private long id;

    //停车场ID
    private long parkingId;

    //车位ID
    private long parkingLotId;

    //变更状态（0：产权变更，1：车位租赁，2：贷款逾期，3：其他）
    private long changeStatus;

    //变更时间
    private Date changeTime;

    //变更记录
    private String changeContent;

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
