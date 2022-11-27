package com.dolphinfeed.disperts.mbg.model;

import com.dolphinfeed.disperts.dto.TaskCreateParams;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.util.Date;

public class Task implements Serializable {
    @ApiModelProperty(value = "任务id，自动生成")
    private Integer id;

    @ApiModelProperty(value = "任务名称")
    private String name;

    @ApiModelProperty(value = "任务描述")
    private String desc;

    @ApiModelProperty(value = "任务状态，0：准备中，1：未调试，2：未启动，3：进行中，4：已完成，5：任务异常")
    private Integer status;

    @ApiModelProperty(value = "任务引擎，0: Locust，1: JMeter")
    private Integer engine;

    @ApiModelProperty(value = "任务创建时间，格式为2021-02-01 04:50:00")
    private Date createTime;

    @ApiModelProperty(value = "任务信息更新时间，格式为2021-02-01 04:50:00")
    private Date updateTime;

    @ApiModelProperty(value = "任务标签，格式如下：['标签1','标签2']")
    private String tags;

    @ApiModelProperty(value = "配置信息，格式如下：{'qps': 100, 'node_num': 10}")
    private String configInfo;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getEngine() {
        return engine;
    }

    public void setEngine(Integer engine) {
        this.engine = engine;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public String getTags() {
        return tags;
    }

    public void setTags(String tags) {
        this.tags = tags;
    }

    public String getConfigInfo() {
        return configInfo;
    }

    public void setConfigInfo(String configInfo) {
        this.configInfo = configInfo;
    }

    public Task(TaskCreateParams taskCreateParams) {
        this.id = 0;
        this.name = taskCreateParams.getName();
        this.desc = taskCreateParams.getDesc();
        this.status = 0;
        this.engine = taskCreateParams.getEngine();
        this.tags = taskCreateParams.getTags().toString();
        this.configInfo = taskCreateParams.getConfigInfo().toString();
        this.createTime = new Date();
        this.updateTime = new Date();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", name=").append(name);
        sb.append(", desc=").append(desc);
        sb.append(", status=").append(status);
        sb.append(", engine=").append(engine);
        sb.append(", createTime=").append(createTime);
        sb.append(", updateTime=").append(updateTime);
        sb.append(", tags=").append(tags);
        sb.append(", configInfo=").append(configInfo);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}