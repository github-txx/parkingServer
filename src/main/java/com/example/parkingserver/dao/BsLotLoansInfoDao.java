package com.example.parkingserver.dao;

import com.example.parkingserver.entity.BsLotLoansInfoVO;

import java.util.List;

/**
 * 贷款车位信息表持久层
 *
 * @author zhouszxfs@xinfushe.com
 * @date 2019-10-30 14:25
 * @param
 * @return
 */
public interface BsLotLoansInfoDao {

    /**
     * [新增]
     * @author zhousze
     * @date 2019/10/30
     **/
    int insert(BsLotLoansInfoVO bsLotLoansInfo);

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
    int update(BsLotLoansInfoVO bsLotLoansInfo);

    /**
     * [查詢] 根據主鍵 id 查詢
     * @author zhousze
     * @date 2019/10/30
     **/
    BsLotLoansInfoVO load(int id);

    /**
     * [查詢] 分頁查詢
     * @author zhousze
     * @date 2019/10/30
     **/
    List<BsLotLoansInfoVO> pageList(int offset, int pagesize);

    /**
     * [查詢] 分頁查詢 count
     * @author zhousze
     * @date 2019/10/30
     **/
    int pageListCount(int offset,int pagesize);
}
