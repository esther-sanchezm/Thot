package com.isthar.masterscreen.repository.common;


import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

public class ContentDocument {

    private static final String KEY = "key";
    private static final String DESCRIPTION = "value";

    @Field(name = KEY)
    private String title;

    @Field(name = DESCRIPTION)
    private String value;

}
