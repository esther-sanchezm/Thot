package com.thot.repository.domain.magic;

import com.thot.repository.domain.magic.document.MagicDocument;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface MagicRepository extends MongoRepository<MagicDocument, Integer> {

    @Override
    Optional<MagicDocument> findById(Integer integer);

}
