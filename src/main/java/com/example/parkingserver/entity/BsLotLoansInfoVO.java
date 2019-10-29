package com.example.parkingserver.entity;

import lombok.Data;

import java.util.Date;

/**
 * 贷款车位信息表
 *
 * @author zhouszxfs@xinfushe.com
 * @date 2019-10-29 17:11
 * @param
 * @return
 */
@Data
public class BsLotLoansInfoVO {

    //主键
    private long id;

    //停车场ID
    private long parkingId;

    //车位ID
    private long parkingLotId;

    //贷款状态
    private long loansStatus;

    //贷款周期
    private String loansPeriod;

    //贷款利率
    private double loansRate;

    //逾期状态
    private long lateStatus;

    //累计逾期次数
    private long lateTimes;

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
