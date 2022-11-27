package com.dolphinfeed.disperts.mbg.model;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.util.Date;

public class Scene implements Serializable {
    @ApiModelProperty(value = "场景id，自动生成")
    private Integer id;

    @ApiModelProperty(value = "任务id")
    private Integer taskId;

    @ApiModelProperty(value = "顺序id")
    private Integer orderId;

    @ApiModelProperty(value = "场景名称")
    private String name;

    @ApiModelProperty(value = "场景状态，0：存在，1：已删除")
    private Integer status;

    @ApiModelProperty(value = "场景创建时间，格式为2021-02-01 04:50:00")
    private Date createTime;

    @ApiModelProperty(value = "场景信息更新时间，格式为2021-02-01 04:50:00")
    private Date updateTime;

    @ApiModelProperty(value = "步骤列表，格式如下：[{'step_id':1,'type':'api','id':1}]")
    private String steps;

    @ApiModelProperty(value = "文件列表，格式如下：[{'key':'bs3DK-1wl4Pl-dKdfE-sdfkF','type':'jmx'}]")
    private String files;

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

    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    public String getSteps() {
        return steps;
    }

    public void setSteps(String steps) {
        this.steps = steps;
    }

    public String getFiles() {
        return files;
    }

    public void setFiles(String files) {
        this.files = files;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", taskId=").append(taskId);
        sb.append(", orderId=").append(orderId);
        sb.append(", name=").append(name);
        sb.append(", status=").append(status);
        sb.append(", createTime=").append(createTime);
        sb.append(", updateTime=").append(updateTime);
        sb.append(", steps=").append(steps);
        sb.append(", files=").append(files);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}