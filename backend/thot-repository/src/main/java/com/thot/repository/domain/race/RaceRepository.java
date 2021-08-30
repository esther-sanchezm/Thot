package com.thot.repository.domain.race;

import com.thot.repository.domain.race.document.RaceDocument;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RaceRepository extends MongoRepository<RaceDocument, Integer> {
}
