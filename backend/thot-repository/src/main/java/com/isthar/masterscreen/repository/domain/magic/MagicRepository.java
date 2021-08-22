package com.isthar.masterscreen.repository.domain.magic;

import com.isthar.masterscreen.repository.domain.magic.entity.MagicDocument;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface MagicRepository extends MongoRepository<MagicDocument, Integer> {

    @Override
    Optional<MagicDocument> findById(Integer integer);

}
