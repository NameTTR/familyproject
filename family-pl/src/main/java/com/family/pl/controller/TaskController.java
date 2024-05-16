package com.family.pl.controller;

import com.family.pl.domain.Task;
import com.family.pl.service.TaskLabelService;
import com.family.pl.service.TaskService;
import com.ruoyi.common.annotation.Anonymous;
import com.ruoyi.common.core.domain.AjaxResult;
import org.aspectj.weaver.loadtime.Aj;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.yaml.snakeyaml.events.Event;

import javax.annotation.Resource;
import java.util.List;

/**
 * 功能：
 * 作者：Name
 * 日期：2024/5/16 15:55
 */
@RestController
@RequestMapping("/family/task")
public class TaskController {

    @Autowired
    private TaskService taskService;

//    @Anonymous
    @GetMapping("info")
    public AjaxResult info(){
        List<Task> tasks = taskService.list();
        return AjaxResult.success(tasks);
    }
}