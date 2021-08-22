package com.isthar.masterscreen.repository.domain.race;

import com.isthar.masterscreen.repository.domain.character.entity.CharacterDocument;
import com.isthar.masterscreen.repository.domain.race.entity.RaceDocument;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RaceRepository extends MongoRepository<RaceDocument, Integer> {
}
