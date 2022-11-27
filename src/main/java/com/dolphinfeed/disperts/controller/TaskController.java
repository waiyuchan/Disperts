package com.dolphinfeed.disperts.controller;

import com.dolphinfeed.disperts.common.api.Result;
import com.dolphinfeed.disperts.dto.TaskCreateParams;
// import com.dolphinfeed.disperts.mbg.model.Task;
import com.dolphinfeed.disperts.mbg.model.Task;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.dolphinfeed.disperts.service.TaskService;

/**
 * ;(task)表控制层
 *
 * @author : waiyu
 * @date : 2022-11-27
 */
@Api(tags = "TaskController", description = "任务管理")
@RestController
@RequestMapping("/task")
public class TaskController {

    @Autowired
    private TaskService taskService;
    private static final Logger logger = LoggerFactory.getLogger(TaskController.class);

    @ApiOperation("创建任务")
    @RequestMapping(method = RequestMethod.POST, produces = "application/json;charset=UTF-8")
    @ResponseBody
    public Result createTask(@RequestBody TaskCreateParams taskCreateParams) {
        Result result;
        Task task = new Task(taskCreateParams);
        System.out.println(task.toString());
        int a = taskService.createTask(task);
        System.out.println(a);
        return null;
    }

}