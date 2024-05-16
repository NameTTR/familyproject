package com.family.pl.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.family.pl.domain.Task;
import com.family.pl.service.TaskService;
import com.family.pl.mapper.TaskMapper;
import org.springframework.stereotype.Service;

/**
* @author 名字
* @description 针对表【pl_task(任务表)】的数据库操作Service实现
* @createDate 2024-05-16 19:21:57
*/
@Service
public class TaskServiceImpl extends ServiceImpl<TaskMapper, Task>
    implements TaskService{

}




