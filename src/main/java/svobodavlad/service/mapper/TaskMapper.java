package svobodavlad.service.mapper;

import org.mapstruct.*;
import svobodavlad.domain.Task;
import svobodavlad.service.dto.TaskDTO;

/**
 * Mapper for the entity {@link Task} and its DTO {@link TaskDTO}.
 */
@Mapper(componentModel = "spring")
public interface TaskMapper extends EntityMapper<TaskDTO, Task> {}
