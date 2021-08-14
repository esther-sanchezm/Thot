package com.isthar.masterscreen.controller.magic;

import com.isthar.masterscreen.controller.magic.resource.Magic;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

public interface MagicController {

    @GetMapping("/magic")
    ResponseEntity<List<Magic>> findAll();
}
