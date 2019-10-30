package com.example.parkingserver.dao;

import com.example.parkingserver.entity.BsParkingLotInfoVO;

import java.util.List;

/**
 * 车位基本信息表持久层
 *
 * @author zhouszxfs@xinfushe.com
 * @date 2019-10-30 14:51
 * @param
 * @return
 */
public interface BsParkingLotInfoDao {

    /**
     * [新增]
     * @author zhousze
     * @date 2019/10/30
     **/
    int insert(BsParkingLotInfoVO bsParkingLotInfo);

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
    int update(BsParkingLotInfoVO bsParkingLotInfo);

    /**
     * [查詢] 根據主鍵 id 查詢
     * @author zhousze
     * @date 2019/10/30
     **/
    BsParkingLotInfoVO load(int id);

    /**
     * [查詢] 分頁查詢
     * @author zhousze
     * @date 2019/10/30
     **/
    List<BsParkingLotInfoVO> pageList(int offset, int pagesize);

    /**
     * [查詢] 分頁查詢 count
     * @author zhousze
     * @date 2019/10/30
     **/
    int pageListCount(int offset,int pagesize);
}
