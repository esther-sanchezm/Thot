package com.isthar.masterscreen.controller.race;

import com.isthar.masterscreen.controller.race.mapper.RaceMapper;
import com.isthar.masterscreen.controller.race.resource.RaceResource;
import com.isthar.masterscreen.repository.domain.race.RaceRepository;
import com.isthar.masterscreen.repository.domain.race.entity.RaceDocument;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
public class DefaultRaceController implements RaceController {

    private static final RaceResource EMPTY = null;
    private final RaceRepository raceRepository;

    private final RaceMapper raceMapper;

    @Autowired
    public DefaultRaceController(final RaceMapper raceMapper, final RaceRepository raceRepository){
        this.raceRepository = raceRepository;
        this.raceMapper = raceMapper;
    }

    @Override
    public ResponseEntity<List<RaceResource>> findAll(String name) {
        List<RaceResource> raceResource = raceMapper.toListDto(raceRepository.findAll());
        return new ResponseEntity<>(raceResource,HttpStatus.OK);
    }

    @Override
    public ResponseEntity<RaceResource> get(Integer id) {
        Optional<RaceDocument> optionalRace = raceRepository.findById(id);
        return (optionalRace.map(raceDocument
                -> new ResponseEntity<>(raceMapper.toDto(raceDocument), HttpStatus.OK)).orElseGet(()
                -> new ResponseEntity<>(HttpStatus.NO_CONTENT)));
    }

    @Override
    public void create(RaceResource raceResource) {
        raceRepository.save(raceMapper.toEntity(raceResource));
    }

    @Override
    public void edit(RaceResource raceResource) {
        raceRepository.save(raceMapper.toEntity(raceResource));
    }
}
