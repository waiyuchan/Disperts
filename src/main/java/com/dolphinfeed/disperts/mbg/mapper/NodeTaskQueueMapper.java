package com.dolphinfeed.disperts.mbg.mapper;

import com.dolphinfeed.disperts.mbg.model.NodeTaskQueue;
import com.dolphinfeed.disperts.mbg.model.NodeTaskQueueExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface NodeTaskQueueMapper {
    long countByExample(NodeTaskQueueExample example);

    int deleteByExample(NodeTaskQueueExample example);

    int deleteByPrimaryKey(@Param("taskId") Integer taskId, @Param("nodeId") Integer nodeId);

    int insert(NodeTaskQueue record);

    int insertSelective(NodeTaskQueue record);

    List<NodeTaskQueue> selectByExample(NodeTaskQueueExample example);

    NodeTaskQueue selectByPrimaryKey(@Param("taskId") Integer taskId, @Param("nodeId") Integer nodeId);

    int updateByExampleSelective(@Param("record") NodeTaskQueue record, @Param("example") NodeTaskQueueExample example);

    int updateByExample(@Param("record") NodeTaskQueue record, @Param("example") NodeTaskQueueExample example);

    int updateByPrimaryKeySelective(NodeTaskQueue record);

    int updateByPrimaryKey(NodeTaskQueue record);
}