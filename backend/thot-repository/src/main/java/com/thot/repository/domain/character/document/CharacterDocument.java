package com.thot.repository.domain.character.document;


import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Document(collection = "Character")
public class CharacterDocument {

    private static final String NAME = "name";
    private static final String DESCRIPTION = "description";


    @Field(name = NAME)
    private String name;

    @Field(name = DESCRIPTION)
    private String description;

    //private RaceEntity race;

}
