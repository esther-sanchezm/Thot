package com.isthar.masterscreen.repository.character;

import com.isthar.masterscreen.repository.character.entity.CharacterEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface CharacterRepository extends JpaRepository<CharacterEntity, Integer> {

    @Override
    Optional<CharacterEntity> findById(Integer integer);

}
