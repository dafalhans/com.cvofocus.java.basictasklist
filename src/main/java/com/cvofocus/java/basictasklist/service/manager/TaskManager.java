package com.cvofocus.java.basictasklist.service.manager;

import com.cvofocus.java.basictasklist.business.domain.TaskEntity;
import com.cvofocus.java.basictasklist.business.repository.TaskRepo;
import com.cvofocus.java.basictasklist.service.dto.Task;
import com.cvofocus.java.basictasklist.service.mapper.TaskMapper;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@AllArgsConstructor
public class TaskManager {

    private final TaskRepo taskRepo;
    private final TaskMapper taskMapper;


    public List<Task> getAll(){
//        List<TaskEntity> allTasks = taskRepo.getTaskEntities();
//        List<Task> result = new ArrayList<>();
//        allTasks.forEach(e -> result.add(taskMapper.toDTO(e)));
//        return result;
        return taskMapper.toDTO(taskRepo.getTaskEntities());
//        return null;
    }


}
