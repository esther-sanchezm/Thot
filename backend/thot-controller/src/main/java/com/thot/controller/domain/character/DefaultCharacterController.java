package com.thot.controller.domain.character;

import com.thot.controller.domain.character.mapper.CharacterMapper;
import com.thot.controller.domain.character.resource.CharacterResource;
import com.thot.controller.domain.character.resource.profile.CharacterProfileResource;
import com.thot.repository.domain.character.CharacterRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@Validated
@RequiredArgsConstructor
public class DefaultCharacterController implements CharacterController {

    private final CharacterRepository characterRepository;

    private final CharacterMapper characterMapper;

    @Override
    public List<CharacterResource> findAll() {
        return null;
    }

    @Override
    public CharacterProfileResource get(Integer id) {
        return null;
    }
}
