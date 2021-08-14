package com.isthar.masterscreen.repository.race.entity;

import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;


@Document(collection = "Race")
public class RaceDocument {

    private static final String ID = "id";
    private static final String NAME = "name";
    private static final String DESCRIPTION = "description";
    private static final String HISTORY = "history";


    @Field(name = NAME)
    private String name;

    @Field(name = DESCRIPTION)
    private String description;

    @Field(name = HISTORY)
    private String history;
}
