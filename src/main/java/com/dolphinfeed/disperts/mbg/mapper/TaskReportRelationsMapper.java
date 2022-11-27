package com.dolphinfeed.disperts.mbg.mapper;

import com.dolphinfeed.disperts.mbg.model.TaskReportRelations;
import com.dolphinfeed.disperts.mbg.model.TaskReportRelationsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TaskReportRelationsMapper {
    long countByExample(TaskReportRelationsExample example);

    int deleteByExample(TaskReportRelationsExample example);

    int deleteByPrimaryKey(@Param("taskId") Integer taskId, @Param("reportId") Integer reportId);

    int insert(TaskReportRelations record);

    int insertSelective(TaskReportRelations record);

    List<TaskReportRelations> selectByExample(TaskReportRelationsExample example);

    int updateByExampleSelective(@Param("record") TaskReportRelations record, @Param("example") TaskReportRelationsExample example);

    int updateByExample(@Param("record") TaskReportRelations record, @Param("example") TaskReportRelationsExample example);
}