package com.thot.controller.domain.race.resource.simple;

import io.swagger.annotations.ApiModel;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@ApiModel("RaceSimple")
@NoArgsConstructor
public class RaceSimpleResource {

    private String name;

    private String description;
}
