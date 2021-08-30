package com.thot.controller.domain.character;

import com.thot.controller.domain.character.resource.CharacterResource;
import com.thot.controller.domain.character.resource.profile.CharacterProfileResource;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class DefaultCharacterController implements CharacterController {

    @Override
    public List<CharacterResource> findAll() {
        return null;
    }

    @Override
    public CharacterProfileResource get() {
        return null;
    }
}
