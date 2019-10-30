package com.example.parkingserver.dao;

import com.example.parkingserver.entity.BsParkingInfoVO;

import java.util.List;

/**
 * 停车场基本信息表持久层
 *
 * @author zhouszxfs@xinfushe.com
 * @date 2019-10-30 14:50
 * @param
 * @return
 */
public interface BsParkingInfoDao {

    /**
     * [新增]
     * @author zhousze
     * @date 2019/10/30
     **/
    int insert(BsParkingInfoVO bsParkingInfo);

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
    int update(BsParkingInfoVO bsParkingInfo);

    /**
     * [查詢] 根據主鍵 id 查詢
     * @author zhousze
     * @date 2019/10/30
     **/
    BsParkingInfoVO load(int id);

    /**
     * [查詢] 分頁查詢
     * @author zhousze
     * @date 2019/10/30
     **/
    List<BsParkingInfoVO> pageList(int offset, int pagesize);

    /**
     * [查詢] 分頁查詢 count
     * @author zhousze
     * @date 2019/10/30
     **/
    int pageListCount(int offset,int pagesize);
}
