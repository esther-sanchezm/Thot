package com.isthar.masterscreen.controller.race.mapper;

import com.isthar.masterscreen.controller.race.resource.RaceResource;
import com.isthar.masterscreen.repository.domain.race.entity.RaceDocument;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface RaceMapper {

    List<RaceResource> toListDto(List<RaceDocument> listRaceDocument);

    RaceResource toDto(RaceDocument raceDocument);

    RaceDocument toEntity(RaceResource raceResource);
}
