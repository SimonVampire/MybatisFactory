package com.paas.model.fss.cav.mapper;

import com.paas.model.fss.cav.bean.FsCavBill;
import java.util.List;

public interface FsCavBillMapper {
    int deleteByPrimaryKey(String id);

    int insert(FsCavBill record);

    FsCavBill selectByPrimaryKey(String id);

    List<FsCavBill> selectAll();

    int updateByPrimaryKey(FsCavBill record);
}