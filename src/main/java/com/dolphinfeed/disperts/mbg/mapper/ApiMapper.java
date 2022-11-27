package com.dolphinfeed.disperts.mbg.mapper;

import com.dolphinfeed.disperts.mbg.model.Api;
import com.dolphinfeed.disperts.mbg.model.ApiExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ApiMapper {
    long countByExample(ApiExample example);

    int deleteByExample(ApiExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Api record);

    int insertSelective(Api record);

    List<Api> selectByExampleWithBLOBs(ApiExample example);

    List<Api> selectByExample(ApiExample example);

    Api selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Api record, @Param("example") ApiExample example);

    int updateByExampleWithBLOBs(@Param("record") Api record, @Param("example") ApiExample example);

    int updateByExample(@Param("record") Api record, @Param("example") ApiExample example);

    int updateByPrimaryKeySelective(Api record);

    int updateByPrimaryKeyWithBLOBs(Api record);

    int updateByPrimaryKey(Api record);
}