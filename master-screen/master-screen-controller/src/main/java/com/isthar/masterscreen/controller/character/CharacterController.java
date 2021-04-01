package com.isthar.masterscreen.controller.character;

import com.isthar.masterscreen.controller.character.resource.CharacterResource;
import com.isthar.masterscreen.controller.character.resource.profile.CharacterProfileResource;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

public interface CharacterController {

    @GetMapping("/character")
    List<CharacterResource> getAllCharacter();

    @GetMapping("/character/{name}")
    CharacterProfileResource getCharacter();

}
