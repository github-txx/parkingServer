package com.example.parkingserver.entity;

import lombok.Data;

import java.util.Date;

/**
 * 停车场基本信息表
 *
 * @param
 * @author zhouszxfs@xinfushe.com
 * @date 2019-10-29 16:44
 * @return
 */
@Data
public class BsParkingInfoVO {

    //主键
    private long id;

    //停车场名称
    private String name;

    //停车场地址
    private String addr;

    //信息录入人
    private long inputUser;

    //信息录入时间
    private Date inputTime;

    //开发商名称
    private String developerName;

    //管理方名称
    private String managerName;

    //运营方名称
    private String operaterName;

    //物业名称
    private String propertyName;

    //设备
    private String equipment;

    //停车场性质
    private String properties;

    //停车场类型
    private long type;

    //产权年限
    private String propertyRights;

    //贷后管理年限
    private String managerRights;

    //停车场评级
    private String level;

    //停车场车位总数量
    private long total;

    //停车场贷后管理车位总数量
    private long managerTotal;

    //资源文件ID
    private String fileId;

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
