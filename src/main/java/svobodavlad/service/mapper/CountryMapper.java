package svobodavlad.service.mapper;

import org.mapstruct.*;
import svobodavlad.domain.Country;
import svobodavlad.domain.Region;
import svobodavlad.service.dto.CountryDTO;
import svobodavlad.service.dto.RegionDTO;

/**
 * Mapper for the entity {@link Country} and its DTO {@link CountryDTO}.
 */
@Mapper(componentModel = "spring")
public interface CountryMapper extends EntityMapper<CountryDTO, Country> {
    @Mapping(target = "region", source = "region", qualifiedByName = "regionId")
    CountryDTO toDto(Country s);

    @Named("regionId")
    @BeanMapping(ignoreByDefault = true)
    @Mapping(target = "id", source = "id")
    RegionDTO toDtoRegionId(Region region);
}
