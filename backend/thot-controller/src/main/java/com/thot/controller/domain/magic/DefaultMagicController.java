package com.thot.controller.domain.magic;

import com.thot.controller.domain.magic.resource.Magic;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
@RequiredArgsConstructor
public class DefaultMagicController implements MagicController {


    @Override
    public ResponseEntity<List<Magic>> findAll() {
   /*     List<MagicDto> listDto = magicService.findAll();
        List<Magic> listMagicResource = new ArrayList<>();
       listDto.forEach((final MagicDto magicDto) ->
                listMagicResource.add(Magic.builder()
                        .name(magicDto.getName())
                        .description(magicDto.getDescription()).build()));
        return new ResponseEntity<>(listMagicResource,(listMagicResource.isEmpty() ? HttpStatus.OK : HttpStatus.NO_CONTENT));
    */
        return null;
    }

}
