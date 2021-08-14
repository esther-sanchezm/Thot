package com.isthar.masterscreen.repository.character;

import com.isthar.masterscreen.repository.character.entity.CharacterDocument;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface CharacterRepository extends MongoRepository<CharacterDocument, Integer> {

    @Override
    Optional<CharacterDocument> findById(Integer integer);

}
