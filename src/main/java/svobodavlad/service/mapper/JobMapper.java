package svobodavlad.service.mapper;

import java.util.Set;
import java.util.stream.Collectors;
import org.mapstruct.*;
import svobodavlad.domain.Employee;
import svobodavlad.domain.Job;
import svobodavlad.domain.Task;
import svobodavlad.service.dto.EmployeeDTO;
import svobodavlad.service.dto.JobDTO;
import svobodavlad.service.dto.TaskDTO;

/**
 * Mapper for the entity {@link Job} and its DTO {@link JobDTO}.
 */
@Mapper(componentModel = "spring")
public interface JobMapper extends EntityMapper<JobDTO, Job> {
    @Mapping(target = "tasks", source = "tasks", qualifiedByName = "taskTitleSet")
    @Mapping(target = "employee", source = "employee", qualifiedByName = "employeeId")
    JobDTO toDto(Job s);

    @Mapping(target = "removeTask", ignore = true)
    Job toEntity(JobDTO jobDTO);

    @Named("taskTitle")
    @BeanMapping(ignoreByDefault = true)
    @Mapping(target = "id", source = "id")
    @Mapping(target = "title", source = "title")
    TaskDTO toDtoTaskTitle(Task task);

    @Named("taskTitleSet")
    default Set<TaskDTO> toDtoTaskTitleSet(Set<Task> task) {
        return task.stream().map(this::toDtoTaskTitle).collect(Collectors.toSet());
    }

    @Named("employeeId")
    @BeanMapping(ignoreByDefault = true)
    @Mapping(target = "id", source = "id")
    EmployeeDTO toDtoEmployeeId(Employee employee);
}
