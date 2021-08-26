package com.isthar.masterscreen.controller.race;

import com.isthar.masterscreen.controller.character.resource.CharacterResource;
import com.isthar.masterscreen.controller.character.resource.profile.CharacterProfileResource;
import com.isthar.masterscreen.controller.race.resource.RaceResource;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

public interface RaceController {

    @GetMapping("/race")
    ResponseEntity<List<RaceResource>> findAll(@RequestParam String name);

    @GetMapping("/race/{id}")
    ResponseEntity<RaceResource> get(Integer id);

    @PostMapping("")
    void create(RaceResource raceResource);

    void edit(RaceResource raceResource);
}
