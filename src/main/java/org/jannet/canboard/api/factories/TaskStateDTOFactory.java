package org.jannet.canboard.api.factories;

import org.jannet.canboard.api.dto.ProjectDTO;
import org.jannet.canboard.api.dto.TaskStateDTO;
import org.jannet.canboard.store.entities.ProjectEntity;
import org.jannet.canboard.store.entities.TaskStateEntity;
import org.springframework.stereotype.Component;

@Component
public class TaskStateDTOFactory {

    public TaskStateDTO makeTaskStateDTO(TaskStateEntity taskStateEntity){
        return TaskStateDTO.builder()
                .id(taskStateEntity.getId())
                .name(taskStateEntity.getName())
                .createdAt(taskStateEntity.getCreatedAt())
                .ordinal(taskStateEntity.getOrdinal())
                .build();
    }
}
