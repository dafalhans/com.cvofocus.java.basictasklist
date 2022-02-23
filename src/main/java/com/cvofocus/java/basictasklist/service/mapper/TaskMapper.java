package com.cvofocus.java.basictasklist.service.mapper;

import com.cvofocus.java.basictasklist.business.domain.TaskEntity;
import com.cvofocus.java.basictasklist.service.dto.Task;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

@Mapper(componentModel = "spring", uses= {AddressMapper.class})
public interface TaskMapper extends IMapper<TaskEntity, Task> {

    //@Override
    @Mappings({
            @Mapping(source = "task.dueDate", target = "dueDate", dateFormat = "ddMMMyy")
    })
    TaskEntity toEntity(Task task);

    //@Override
    @Mappings({
            @Mapping(source = "taskEntity.dueDate", target = "dueDate", dateFormat = "ddMMMyy"),
            @Mapping(source = "taskEntity.executor.firstName", target="firstName"),
            @Mapping(source = "taskEntity.executor.lastName", target="lastName"),
            @Mapping(source = "taskEntity.executor.address.cc",target="cc", qualifiedByName = "countryCodeEnumToString")
    })
    Task toDTO(TaskEntity taskEntity);
}
