package com.dolphinfeed.disperts.mbg.mapper;

import com.dolphinfeed.disperts.mbg.model.SceneActionRelations;
import com.dolphinfeed.disperts.mbg.model.SceneActionRelationsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SceneActionRelationsMapper {
    long countByExample(SceneActionRelationsExample example);

    int deleteByExample(SceneActionRelationsExample example);

    int deleteByPrimaryKey(@Param("sceneId") Integer sceneId, @Param("actionId") Integer actionId);

    int insert(SceneActionRelations record);

    int insertSelective(SceneActionRelations record);

    List<SceneActionRelations> selectByExample(SceneActionRelationsExample example);

    int updateByExampleSelective(@Param("record") SceneActionRelations record, @Param("example") SceneActionRelationsExample example);

    int updateByExample(@Param("record") SceneActionRelations record, @Param("example") SceneActionRelationsExample example);
}