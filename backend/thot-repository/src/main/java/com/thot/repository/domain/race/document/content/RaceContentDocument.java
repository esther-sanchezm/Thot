package com.thot.repository.domain.race.document.content;


import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.mapping.Field;

@Data
@NoArgsConstructor
public class RaceContentDocument {

    private static final String KEY = "key";
    private static final String DESCRIPTION = "value";

    @Field(name = KEY)
    private String title;

    @Field(name = DESCRIPTION)
    private String value;

}
