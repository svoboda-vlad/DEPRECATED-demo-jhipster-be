package svobodavlad.service.mapper;

import org.mapstruct.*;
import svobodavlad.domain.Region;
import svobodavlad.service.dto.RegionDTO;

/**
 * Mapper for the entity {@link Region} and its DTO {@link RegionDTO}.
 */
@Mapper(componentModel = "spring")
public interface RegionMapper extends EntityMapper<RegionDTO, Region> {}
