package com.thot.controller.domain.magic;

import com.thot.controller.domain.magic.resource.Magic;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

public interface MagicController {

    @GetMapping("/magic")
    ResponseEntity<List<Magic>> findAll();
}
