package com.isthar.masterscreen.repository.magic;

import com.isthar.masterscreen.repository.character.entity.CharacterEntity;
import com.isthar.masterscreen.repository.magic.entity.MagicEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface MagicRepository extends JpaRepository<MagicEntity, Integer> {

    @Override
    Optional<MagicEntity> findById(Integer integer);

}
