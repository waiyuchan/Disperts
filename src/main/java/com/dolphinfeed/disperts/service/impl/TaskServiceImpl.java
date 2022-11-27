package com.dolphinfeed.disperts.service.impl;

// import com.dolphinfeed.disperts.mbg.model.Task;

import com.dolphinfeed.disperts.mbg.mapper.TaskMapper;
import com.dolphinfeed.disperts.mbg.model.Task;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.dolphinfeed.disperts.service.TaskService;

/**
 * ;(task)表服务实现类
 *
 * @author : http://www.chiner.pro
 * @date : 2022-11-27
 */

@Service("TaskServiceImpl")
public class TaskServiceImpl implements TaskService {

    @Autowired
    private TaskMapper taskMapper;

    @Override
    public int createTask(Task task) {
        return taskMapper.insert(task);
    }
}