package com.thot.controller.domain.magic.mapper;

import com.thot.controller.domain.magic.resource.MagicResource;
import com.thot.repository.domain.magic.document.MagicDocument;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface MagicMapper {

    List<MagicResource> toListResource(List<MagicDocument> listDocument);
}
