package org.jannet.canboard.api.factories;

import org.jannet.canboard.api.dto.TaskDTO;
import org.jannet.canboard.api.dto.TaskStateDTO;
import org.jannet.canboard.store.entities.TaskEntity;
import org.jannet.canboard.store.entities.TaskStateEntity;
import org.springframework.stereotype.Component;

@Component
public class TaskDTOFactory {
    public TaskDTO makeTaskStateDTO(TaskEntity taskEntity){
        return TaskDTO.builder()
                .id(taskEntity.getId())
                .name(taskEntity.getName())
                .createdAt(taskEntity.getCreatedAt())
                .description(taskEntity.getDescription())
                .build();
    }
}
