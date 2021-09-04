package com.thot.controller.domain.magic;

import com.thot.controller.domain.magic.mapper.MagicMapper;
import com.thot.controller.domain.magic.resource.MagicResource;
import com.thot.repository.domain.magic.MagicRepository;
import com.thot.repository.domain.magic.document.MagicDocument;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class DefaultMagicController implements MagicController {

    private final MagicRepository magicRepository;

    private final MagicMapper magicMapper;

    @Override
    public ResponseEntity<List<MagicResource>> findAll() {
        List<MagicDocument> listDocument = magicRepository.findAll();
        List<MagicResource> listMagicResource = magicMapper.toListResource(listDocument);
        return new ResponseEntity<>(listMagicResource,(listMagicResource.isEmpty() ? HttpStatus.OK : HttpStatus.NO_CONTENT));
    }

}
