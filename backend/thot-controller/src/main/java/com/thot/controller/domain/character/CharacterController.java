package com.thot.controller.domain.character;

import com.thot.controller.domain.character.resource.CharacterResource;
import com.thot.controller.domain.character.resource.profile.CharacterProfileResource;
import io.swagger.annotations.Api;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Api(value = "Race")
@RequestMapping("/character")
public interface CharacterController {

    @GetMapping("")
    List<CharacterResource> findAll();

    @GetMapping("/{id}")
    CharacterProfileResource get(Integer id);

}
