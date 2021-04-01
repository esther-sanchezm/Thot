package com.isthar.masterscreen.service.magic;

import com.isthar.masterscreen.repository.magic.MagicRepository;
import com.isthar.masterscreen.repository.magic.entity.MagicEntity;
import com.isthar.masterscreen.service.magic.dto.MagicDto;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class DefaultMagicService implements MagicService {

    private final MagicRepository magicRepository;

    @Override
    public List<MagicDto> findAll() {
        List<MagicEntity> listMagicEntity = magicRepository.findAll();
        List<MagicDto> listMagicDto = new ArrayList<>();
        listMagicEntity.forEach((final MagicEntity magicEntity) ->
                listMagicDto.add(MagicDto.builder()
                        .name(magicEntity.getName())
                        .description(magicEntity.getDescription()).build()));
        return listMagicDto;
    }

}
