package com.dolphinfeed.disperts.dto;

import com.alibaba.fastjson.JSONObject;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.constraints.NotEmpty;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class TaskCreateParams {
    @ApiModelProperty(value = "任务名称", required = true)
    @NotEmpty(message = "任务名不能为空")
    String name;

    @ApiModelProperty(value = "任务描述", required = true)
    String desc;

    @ApiModelProperty(value = "任务执行引擎", required = true)
    Integer engine;

    @ApiModelProperty(value = "任务标签")
    ArrayList<String> tags;

    @ApiModelProperty(value = "任务配置信息", required = true)
    JSONObject configInfo;

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

    public Integer getEngine() {
        return engine;
    }

    public void setEngine(Integer engine) {
        this.engine = engine;
    }

    public ArrayList<String> getTags() {
        return tags;
    }

    public void setTags(ArrayList<String> tags) {
        this.tags = tags;
    }


    public JSONObject getConfigInfo() {
        return configInfo;
    }

    public void setConfigInfo(JSONObject configInfo) {
        this.configInfo = configInfo;
    }

    @Override
    public String toString() {
        return "TaskCreateParams{" +
                "name='" + name + '\'' +
                ", desc='" + desc + '\'' +
                ", engine=" + engine +
                ", tags=" + tags +
                ", configInfo=" + configInfo +
                '}';
    }
}
