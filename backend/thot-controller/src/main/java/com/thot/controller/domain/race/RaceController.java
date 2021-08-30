package com.thot.controller.domain.race;

import com.thot.controller.domain.race.resource.RaceResource;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Api(value = "Race")
@RequestMapping("/race")
public interface RaceController {

    @ApiOperation(value = "Create race")
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Find all race")
    })
    @GetMapping("")
    ResponseEntity<List<RaceResource>> findAll(@RequestParam String name);

    @ApiOperation(value = "Get race")
    @ApiResponses(value = {
            @ApiResponse(code = 201, message = "Get race")
    })
    @GetMapping("{id}")
    ResponseEntity<RaceResource> get(Integer id);

    @ApiOperation(value = "Create race")
    @ApiResponses(value = {
            @ApiResponse(code = 201, message = "Created race")
    })
    @PostMapping("")
    void create(RaceResource raceResource);

    @ApiOperation(value = "Get race")
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Obtained race")
    })
    @PutMapping("{id}")
    void edit(RaceResource raceResource);
}
