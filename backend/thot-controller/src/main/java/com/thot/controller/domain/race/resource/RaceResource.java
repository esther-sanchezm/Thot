package com.thot.controller.domain.race.resource;

import io.swagger.annotations.ApiModel;
import lombok.Data;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Data
@ApiModel("Race")
public class RaceResource {

    @NotBlank
    private String name;

}
