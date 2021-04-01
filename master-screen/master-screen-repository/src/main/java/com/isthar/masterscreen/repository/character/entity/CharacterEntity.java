package com.isthar.masterscreen.repository.character.entity;


import com.isthar.masterscreen.repository.race.entity.RaceEntity;

import javax.persistence.*;

@Entity
@Table(name = "Character")
public class CharacterEntity {

    private static final String ID = "id";
    private static final String NAME = "name";
    private static final String DESCRIPTION = "description";

    @Id
    @Column(name = ID)
    private Integer id;

    @Column(name = NAME)
    private String name;

    @Column(name = DESCRIPTION)
    private String description;

    @ManyToOne
    @JoinColumn(name = "id")
    private RaceEntity race;

    @ManyToOne
    @JoinColumn(name = "id")
    private CharacterEntity character;
    
}
