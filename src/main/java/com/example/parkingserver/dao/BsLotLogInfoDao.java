package com.example.parkingserver.dao;

import com.example.parkingserver.entity.BsLotLogInfoVO;

import java.util.List;

/**
 * 车位日志表持久层
 *
 * @author zhouszxfs@xinfushe.com
 * @date 2019-10-30 14:33
 * @param
 * @return
 */
public interface BsLotLogInfoDao {

    /**
     * [新增]
     * @author zhousze
     * @date 2019/10/30
     **/
    int insert(BsLotLogInfoVO bsLotLogInfo);

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
    int update(BsLotLogInfoVO bsLotLogInfo);

    /**
     * [查詢] 根據主鍵 id 查詢
     * @author zhousze
     * @date 2019/10/30
     **/
    BsLotLogInfoVO load(int id);

    /**
     * [查詢] 分頁查詢
     * @author zhousze
     * @date 2019/10/30
     **/
    List<BsLotLogInfoVO> pageList(int offset, int pagesize);

    /**
     * [查詢] 分頁查詢 count
     * @author zhousze
     * @date 2019/10/30
     **/
    int pageListCount(int offset,int pagesize);
}
