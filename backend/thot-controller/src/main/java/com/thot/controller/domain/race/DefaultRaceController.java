package com.thot.controller.domain.race;

import com.thot.controller.domain.race.mapper.RaceMapper;
import com.thot.controller.domain.race.resource.RaceResource;
import com.thot.repository.domain.race.RaceRepository;
import com.thot.repository.domain.race.document.RaceDocument;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@Validated
@RequiredArgsConstructor
public class DefaultRaceController implements RaceController {

    private static final RaceResource EMPTY = null;
    private final RaceRepository raceRepository;

    private final RaceMapper raceMapper;


    @Override
    public ResponseEntity<List<RaceResource>> findAll(String name) {
        List<RaceResource> raceResource =raceMapper .toListDto(raceRepository.findAll());
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
    public ResponseEntity create(RaceResource raceResource) {
        raceRepository.save(raceMapper.toEntity(raceResource));
        throw new CustomerException("");
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);
    }

    @Override
    public ResponseEntity edit(RaceResource raceResource) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);
    }
}
