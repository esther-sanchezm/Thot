package com.isthar.masterscreen.service.character;

import com.isthar.masterscreen.repository.magic.MagicRepository;
import com.isthar.masterscreen.repository.magic.entity.MagicEntity;
import com.isthar.masterscreen.service.character.dto.MagicDto;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DefaultMagicService implements MagicService {

    MagicRepository magicRepository;

    @Override
    public MagicDto findAll() {
        List<MagicEntity> listMagicEntity = magicRepository.findAll();
        return null;
    }

}
