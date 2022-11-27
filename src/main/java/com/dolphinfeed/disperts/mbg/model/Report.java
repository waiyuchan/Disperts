package com.dolphinfeed.disperts.mbg.model;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.util.Date;

public class Report implements Serializable {
    @ApiModelProperty(value = "报告id，自动生成")
    private Integer id;

    @ApiModelProperty(value = "任务id")
    private Integer taskId;

    @ApiModelProperty(value = "压测时长")
    private Integer duration;

    @ApiModelProperty(value = "压测引擎")
    private String engine;

    @ApiModelProperty(value = "报告状态，0: 正常，1: 已删除")
    private Integer status;

    @ApiModelProperty(value = "报告创建时间，格式为2021-02-01 04:50:00")
    private Date createTime;

    @ApiModelProperty(value = "压测数据")
    private String statsData;

    @ApiModelProperty(value = "配置信息，格式如下：{'qps': 100, 'node_num': 10}")
    private String configInfo;

    @ApiModelProperty(value = "施压数据")
    private String result;

    @ApiModelProperty(value = "业务指标")
    private String businessIndicators;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getTaskId() {
        return taskId;
    }

    public void setTaskId(Integer taskId) {
        this.taskId = taskId;
    }

    public Integer getDuration() {
        return duration;
    }

    public void setDuration(Integer duration) {
        this.duration = duration;
    }

    public String getEngine() {
        return engine;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getStatsData() {
        return statsData;
    }

    public void setStatsData(String statsData) {
        this.statsData = statsData;
    }

    public String getConfigInfo() {
        return configInfo;
    }

    public void setConfigInfo(String configInfo) {
        this.configInfo = configInfo;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    public String getBusinessIndicators() {
        return businessIndicators;
    }

    public void setBusinessIndicators(String businessIndicators) {
        this.businessIndicators = businessIndicators;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", taskId=").append(taskId);
        sb.append(", duration=").append(duration);
        sb.append(", engine=").append(engine);
        sb.append(", status=").append(status);
        sb.append(", createTime=").append(createTime);
        sb.append(", statsData=").append(statsData);
        sb.append(", configInfo=").append(configInfo);
        sb.append(", result=").append(result);
        sb.append(", businessIndicators=").append(businessIndicators);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}