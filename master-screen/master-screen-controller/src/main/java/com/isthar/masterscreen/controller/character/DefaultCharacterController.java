package com.isthar.masterscreen.controller.character;

import com.isthar.masterscreen.controller.character.CharacterController;
import com.isthar.masterscreen.controller.character.resource.CharacterResource;
import com.isthar.masterscreen.controller.character.resource.profile.CharacterProfileResource;
import org.springframework.web.bind.annotation.GetMapping;
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
