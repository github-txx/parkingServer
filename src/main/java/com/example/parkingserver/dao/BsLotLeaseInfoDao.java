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
     * 查询总数
     */
    public int countFindAll();

    /**
     * 根据条件查询
     */
    public List<BsLotLeaseInfoVO> freeFind(BsLotLeaseInfoVO obj);

    /**
     * 根据条件查询的数量
     */
    public int countFreeFind(BsLotLeaseInfoVO obj);

    /**
     * 根据主键查询对象
     */
    public BsLotLeaseInfoVO findByPK(BsLotLeaseInfoVO obj);

    /**
     * 添加对象
     */
    public void insert(BsLotLeaseInfoVO obj);

    /**
     * 根据主键修改对象
     */
    public void update(BsLotLeaseInfoVO obj);

    /**
     * 根据主键删除对象
     */
    public void remove(BsLotLeaseInfoVO obj);
}
