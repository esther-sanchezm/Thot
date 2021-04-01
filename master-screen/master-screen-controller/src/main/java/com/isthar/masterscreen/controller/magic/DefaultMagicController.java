package com.isthar.masterscreen.controller.magic;

import com.isthar.masterscreen.controller.magic.resource.Magic;
import com.isthar.masterscreen.service.magic.MagicService;
import com.isthar.masterscreen.service.magic.dto.MagicDto;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequiredArgsConstructor
public class DefaultMagicController implements MagicController {

    private final MagicService magicService;

    @Override
    public ResponseEntity<List<Magic>> findAll() {
        List<MagicDto> listDto = magicService.findAll();
        List<Magic> listMagicResource = new ArrayList<>();
       listDto.forEach((final MagicDto magicDto) ->
                listMagicResource.add(Magic.builder()
                        .name(magicDto.getName())
                        .description(magicDto.getDescription()).build()));
        return new ResponseEntity<>(listMagicResource,(listMagicResource.isEmpty() ? HttpStatus.OK : HttpStatus.NO_CONTENT));
    }
}
