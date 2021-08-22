package com.isthar.masterscreen.repository.domain.race.entity;

import com.isthar.masterscreen.repository.common.ContentDocument;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;


@Document(collection = "Race")
public class RaceDocument {

    private static final String ID = "id";
    private static final String NAME = "name";
    private static final String DESCRIPTION = "description";
    private static final String CONTENT = "content";


    @Field(name = NAME)
    private String name;

    @Field(name = DESCRIPTION)
    private String description;

    @Field(name = CONTENT)
    private ContentDocument content;
}
