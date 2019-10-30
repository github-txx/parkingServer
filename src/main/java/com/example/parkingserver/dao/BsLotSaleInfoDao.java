package com.example.parkingserver.dao;

import com.example.parkingserver.entity.BsLotSaleInfoVO;

import java.util.List;

/**
 * 车位销售信息表持久层
 *
 * @author zhouszxfs@xinfushe.com
 * @date 2019-10-30 14:50
 * @param
 * @return
 */
public interface BsLotSaleInfoDao {

    /**
     * [新增]
     * @author zhousze
     * @date 2019/10/30
     **/
    int insert(BsLotSaleInfoVO bsLotSaleInfo);

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
    int update(BsLotSaleInfoVO bsLotSaleInfo);

    /**
     * [查詢] 根據主鍵 id 查詢
     * @author zhousze
     * @date 2019/10/30
     **/
    BsLotSaleInfoVO load(int id);

    /**
     * [查詢] 分頁查詢
     * @author zhousze
     * @date 2019/10/30
     **/
    List<BsLotSaleInfoVO> pageList(int offset, int pagesize);

    /**
     * [查詢] 分頁查詢 count
     * @author zhousze
     * @date 2019/10/30
     **/
    int pageListCount(int offset,int pagesize);
}
