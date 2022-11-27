package com.dolphinfeed.disperts.mbg.model;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.util.Date;

public class Node implements Serializable {
    @ApiModelProperty(value = "节点id，自动生成")
    private Integer id;

    @ApiModelProperty(value = "节点名称")
    private String name;

    @ApiModelProperty(value = "节点ip")
    private String ip;

    @ApiModelProperty(value = "节点端口")
    private String port;

    @ApiModelProperty(value = "节点登陆账号名")
    private String username;

    @ApiModelProperty(value = "节点登陆账号密码")
    private String password;

    @ApiModelProperty(value = "节点描述")
    private String desc;

    @ApiModelProperty(value = "节点状态，0：可使用，1：使用中，2：已停用，4：已删除")
    private Integer status;

    @ApiModelProperty(value = "节点新增时间，格式为2021-02-01 04:50:00")
    private Date createTime;

    @ApiModelProperty(value = "节点信息更新时间，格式为2021-02-01 04:50:00")
    private Date updateTime;

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

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public String getPort() {
        return port;
    }

    public void setPort(String port) {
        this.port = port;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
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

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", name=").append(name);
        sb.append(", ip=").append(ip);
        sb.append(", port=").append(port);
        sb.append(", username=").append(username);
        sb.append(", password=").append(password);
        sb.append(", desc=").append(desc);
        sb.append(", status=").append(status);
        sb.append(", createTime=").append(createTime);
        sb.append(", updateTime=").append(updateTime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}