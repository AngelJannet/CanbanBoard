package org.jannet.canboard.api.factories;

import org.jannet.canboard.api.dto.ProjectDTO;
import org.jannet.canboard.store.entities.ProjectEntity;
import org.springframework.stereotype.Component;

@Component
public class ProjectDTOFactory {

    public ProjectDTO makeProjectDTO(ProjectEntity projectEntity){
        return ProjectDTO.builder()
                .id(projectEntity.getId())
                .name(projectEntity.getName())
                .createdAt(projectEntity.getCreateAt())
                .build();
    }
}
