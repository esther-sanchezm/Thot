package com.isthar.masterscreen.repository.race;

import com.isthar.masterscreen.repository.character.entity.CharacterDocument;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RaceRepository extends MongoRepository<CharacterDocument, Integer> {
}
