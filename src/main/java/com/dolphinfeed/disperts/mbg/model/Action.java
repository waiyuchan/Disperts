package com.dolphinfeed.disperts.mbg.model;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.util.Date;

public class Action implements Serializable {
    @ApiModelProperty(value = "操作id，自动生成")
    private Integer id;

    @ApiModelProperty(value = "场景id")
    private Integer sceneId;

    @ApiModelProperty(value = "场景中的操作id")
    private Integer actionId;

    @ApiModelProperty(value = "操作起始步骤id")
    private Integer preStepId;

    @ApiModelProperty(value = "操作结束步骤id")
    private Integer lastStepId;

    @ApiModelProperty(value = "操作状态，0：存在，1：已删除")
    private Integer status;

    @ApiModelProperty(value = "操作创建时间，格式为2021-02-01 04:50:00")
    private Date createTime;

    @ApiModelProperty(value = "操作信息更新时间，格式为2021-02-01 04:50:00")
    private Date updateTime;

    @ApiModelProperty(value = "操作配置数据")
    private String config;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getSceneId() {
        return sceneId;
    }

    public void setSceneId(Integer sceneId) {
        this.sceneId = sceneId;
    }

    public Integer getActionId() {
        return actionId;
    }

    public void setActionId(Integer actionId) {
        this.actionId = actionId;
    }

    public Integer getPreStepId() {
        return preStepId;
    }

    public void setPreStepId(Integer preStepId) {
        this.preStepId = preStepId;
    }

    public Integer getLastStepId() {
        return lastStepId;
    }

    public void setLastStepId(Integer lastStepId) {
        this.lastStepId = lastStepId;
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

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public String getConfig() {
        return config;
    }

    public void setConfig(String config) {
        this.config = config;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", sceneId=").append(sceneId);
        sb.append(", actionId=").append(actionId);
        sb.append(", preStepId=").append(preStepId);
        sb.append(", lastStepId=").append(lastStepId);
        sb.append(", status=").append(status);
        sb.append(", createTime=").append(createTime);
        sb.append(", updateTime=").append(updateTime);
        sb.append(", config=").append(config);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}