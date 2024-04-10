package org.jannet.canboard.store.reposetories;

import org.jannet.canboard.store.entities.TaskEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TaskRepository extends JpaRepository<TaskEntity, Long> {
}
