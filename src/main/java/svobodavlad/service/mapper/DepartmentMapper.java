package svobodavlad.service.mapper;

import org.mapstruct.*;
import svobodavlad.domain.Department;
import svobodavlad.domain.Location;
import svobodavlad.service.dto.DepartmentDTO;
import svobodavlad.service.dto.LocationDTO;

/**
 * Mapper for the entity {@link Department} and its DTO {@link DepartmentDTO}.
 */
@Mapper(componentModel = "spring")
public interface DepartmentMapper extends EntityMapper<DepartmentDTO, Department> {
    @Mapping(target = "location", source = "location", qualifiedByName = "locationId")
    DepartmentDTO toDto(Department s);

    @Named("locationId")
    @BeanMapping(ignoreByDefault = true)
    @Mapping(target = "id", source = "id")
    LocationDTO toDtoLocationId(Location location);
}
