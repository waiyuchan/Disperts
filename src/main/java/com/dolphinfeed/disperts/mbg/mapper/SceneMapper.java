package com.dolphinfeed.disperts.mbg.mapper;

import com.dolphinfeed.disperts.mbg.model.Scene;
import com.dolphinfeed.disperts.mbg.model.SceneExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SceneMapper {
    long countByExample(SceneExample example);

    int deleteByExample(SceneExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Scene record);

    int insertSelective(Scene record);

    List<Scene> selectByExampleWithBLOBs(SceneExample example);

    List<Scene> selectByExample(SceneExample example);

    Scene selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Scene record, @Param("example") SceneExample example);

    int updateByExampleWithBLOBs(@Param("record") Scene record, @Param("example") SceneExample example);

    int updateByExample(@Param("record") Scene record, @Param("example") SceneExample example);

    int updateByPrimaryKeySelective(Scene record);

    int updateByPrimaryKeyWithBLOBs(Scene record);

    int updateByPrimaryKey(Scene record);
}