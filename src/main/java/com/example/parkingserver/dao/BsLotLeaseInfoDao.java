package com.example.parkingserver.dao;

import com.example.parkingserver.entity.BsLotLeaseInfoVO;

import java.util.List;

/**
 * 月租车信息表持久层
 *
 * @author zhouszxfs@xinfushe.com
 * @date 2019-10-29 19:17
 * @param
 * @return
 */
public interface BsLotLeaseInfoDao {

    /**
     * [新增]
     * @author zhousze
     * @date 2019/10/30
     **/
    int insert(BsLotLeaseInfoVO bsLotLeaseInfo);

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
    int update(BsLotLeaseInfoVO bsLotLeaseInfo);

    /**
     * [查詢] 根據主鍵 id 查詢
     * @author zhousze
     * @date 2019/10/30
     **/
    BsLotLeaseInfoVO load(int id);

    /**
     * [查詢] 分頁查詢
     * @author zhousze
     * @date 2019/10/30
     **/
    List<BsLotLeaseInfoVO> pageList(int offset, int pagesize);

    /**
     * [查詢] 分頁查詢 count
     * @author zhousze
     * @date 2019/10/30
     **/
    int pageListCount(int offset,int pagesize);

}
