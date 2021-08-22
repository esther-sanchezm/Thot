package com.isthar.masterscreen.repository.domain.magic.entity;

import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;


@Data
@Document(collection = "Magic")
public class MagicDocument {

    private static final String ID = "id";
    private static final String NAME = "name";
    private static final String DESCRIPTION = "description";


    @Field(name = NAME)
    private String name;

    @Field(name = DESCRIPTION)
    private String description;

}
