package com.example.parkingserver.dao;

import com.example.parkingserver.entity.BsLotMortgageInfoVO;

import java.util.List;

/**
 * 抵押车位信息表持久层
 *
 * @author zhouszxfs@xinfushe.com
 * @date 2019-10-30 14:42
 * @param
 * @return
 */
public interface BsLotMortgageInfoDao {

    /**
     * [新增]
     * @author zhousze
     * @date 2019/10/30
     **/
    int insert(BsLotMortgageInfoVO bsLotMortgageInfo);

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
    int update(BsLotMortgageInfoVO bsLotMortgageInfo);

    /**
     * [查詢] 根據主鍵 id 查詢
     * @author zhousze
     * @date 2019/10/30
     **/
    BsLotMortgageInfoVO load(int id);

    /**
     * [查詢] 分頁查詢
     * @author zhousze
     * @date 2019/10/30
     **/
    List<BsLotMortgageInfoVO> pageList(int offset, int pagesize);

    /**
     * [查詢] 分頁查詢 count
     * @author zhousze
     * @date 2019/10/30
     **/
    int pageListCount(int offset,int pagesize);
}
