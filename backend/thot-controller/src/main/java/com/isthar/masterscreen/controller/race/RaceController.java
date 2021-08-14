package com.isthar.masterscreen.controller.race;

import com.isthar.masterscreen.controller.character.resource.CharacterResource;
import com.isthar.masterscreen.controller.character.resource.profile.CharacterProfileResource;
import com.isthar.masterscreen.controller.race.resource.RaceResource;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

public interface RaceController {

    @GetMapping("/race")
    List<RaceResource> findAll();

    @GetMapping("/race/{name}")
    RaceResource get();

}
