package com.thot.controller.domain.magic;

import com.thot.controller.domain.magic.resource.MagicResource;
import io.swagger.annotations.Api;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Api(value = "Magic")
@RequestMapping("/magic")
public interface MagicController {

    @GetMapping("")
    ResponseEntity<List<MagicResource>> findAll();
}
