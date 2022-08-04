package svobodavlad.service.mapper;

import org.mapstruct.*;
import svobodavlad.domain.Country;
import svobodavlad.domain.Location;
import svobodavlad.service.dto.CountryDTO;
import svobodavlad.service.dto.LocationDTO;

/**
 * Mapper for the entity {@link Location} and its DTO {@link LocationDTO}.
 */
@Mapper(componentModel = "spring")
public interface LocationMapper extends EntityMapper<LocationDTO, Location> {
    @Mapping(target = "country", source = "country", qualifiedByName = "countryId")
    LocationDTO toDto(Location s);

    @Named("countryId")
    @BeanMapping(ignoreByDefault = true)
    @Mapping(target = "id", source = "id")
    CountryDTO toDtoCountryId(Country country);
}
