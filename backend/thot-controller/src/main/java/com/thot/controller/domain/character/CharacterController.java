package com.thot.controller.domain.character;

import com.thot.controller.domain.character.resource.CharacterResource;
import com.thot.controller.domain.character.resource.profile.CharacterProfileResource;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

public interface CharacterController {

    @GetMapping("/character")
    List<CharacterResource> findAll();

    @GetMapping("/character/{name}")
    CharacterProfileResource get();

}
