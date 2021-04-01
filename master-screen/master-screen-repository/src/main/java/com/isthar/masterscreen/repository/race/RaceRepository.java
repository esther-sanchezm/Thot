package com.isthar.masterscreen.repository.race;

import com.isthar.masterscreen.repository.character.entity.CharacterEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RaceRepository extends JpaRepository<CharacterEntity, Integer>  {
}
