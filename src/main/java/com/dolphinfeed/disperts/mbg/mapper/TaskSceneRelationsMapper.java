package com.dolphinfeed.disperts.mbg.mapper;

import com.dolphinfeed.disperts.mbg.model.TaskSceneRelations;
import com.dolphinfeed.disperts.mbg.model.TaskSceneRelationsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TaskSceneRelationsMapper {
    long countByExample(TaskSceneRelationsExample example);

    int deleteByExample(TaskSceneRelationsExample example);

    int deleteByPrimaryKey(@Param("taskId") Integer taskId, @Param("sceneId") Integer sceneId);

    int insert(TaskSceneRelations record);

    int insertSelective(TaskSceneRelations record);

    List<TaskSceneRelations> selectByExample(TaskSceneRelationsExample example);

    int updateByExampleSelective(@Param("record") TaskSceneRelations record, @Param("example") TaskSceneRelationsExample example);

    int updateByExample(@Param("record") TaskSceneRelations record, @Param("example") TaskSceneRelationsExample example);
}