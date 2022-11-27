package com.dolphinfeed.disperts.mbg.model;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.util.Date;

public class Api implements Serializable {
    @ApiModelProperty(value = "接口id，自动生成")
    private Integer id;

    @ApiModelProperty(value = "场景id")
    private Integer sceneId;

    @ApiModelProperty(value = "接口名称")
    private String name;

    @ApiModelProperty(value = "请求方法，如GET、POST、PUT、DELETE等")
    private String method;

    @ApiModelProperty(value = "接口状态，0：存在，1：已删除")
    private Integer status;

    @ApiModelProperty(value = "接口创建时间，格式为2021-02-01 04:50:00")
    private Date createTime;

    @ApiModelProperty(value = "接口信息更新时间，格式为2021-02-01 04:50:00")
    private Date updateTime;

    @ApiModelProperty(value = "请求URL")
    private String url;

    @ApiModelProperty(value = "请求携带数据内容")
    private String content;

    @ApiModelProperty(value = "请求返回断言内容")
    private String assertion;

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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMethod() {
        return method;
    }

    public void setMethod(String method) {
        this.method = method;
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

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getAssertion() {
        return assertion;
    }

    public void setAssertion(String assertion) {
        this.assertion = assertion;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", sceneId=").append(sceneId);
        sb.append(", name=").append(name);
        sb.append(", method=").append(method);
        sb.append(", status=").append(status);
        sb.append(", createTime=").append(createTime);
        sb.append(", updateTime=").append(updateTime);
        sb.append(", url=").append(url);
        sb.append(", content=").append(content);
        sb.append(", assertion=").append(assertion);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}