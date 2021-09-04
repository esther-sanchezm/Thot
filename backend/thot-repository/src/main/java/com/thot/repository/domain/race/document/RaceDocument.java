package com.thot.repository.domain.race.document;

import com.thot.repository.domain.race.document.content.RaceContentDocument;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Data
@NoArgsConstructor
@Document(collection = "Race")
public class RaceDocument {

    private static final String ID = "id";
    private static final String NAME = "name";
    private static final String DESCRIPTION = "description";
    private static final String CONTENT = "content";

    @Id
    private Integer id; //I have to review the functionality of ids in mongoDB

    @Field(name = NAME)
    private String name;

    @Field(name = DESCRIPTION)
    private String description;

    @Field(name = CONTENT)
    private RaceContentDocument content;
}
