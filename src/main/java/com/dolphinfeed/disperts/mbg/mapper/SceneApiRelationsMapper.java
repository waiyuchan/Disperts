package com.dolphinfeed.disperts.mbg.mapper;

import com.dolphinfeed.disperts.mbg.model.SceneApiRelations;
import com.dolphinfeed.disperts.mbg.model.SceneApiRelationsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SceneApiRelationsMapper {
    long countByExample(SceneApiRelationsExample example);

    int deleteByExample(SceneApiRelationsExample example);

    int deleteByPrimaryKey(@Param("sceneId") Integer sceneId, @Param("apiId") Integer apiId);

    int insert(SceneApiRelations record);

    int insertSelective(SceneApiRelations record);

    List<SceneApiRelations> selectByExample(SceneApiRelationsExample example);

    int updateByExampleSelective(@Param("record") SceneApiRelations record, @Param("example") SceneApiRelationsExample example);

    int updateByExample(@Param("record") SceneApiRelations record, @Param("example") SceneApiRelationsExample example);
}