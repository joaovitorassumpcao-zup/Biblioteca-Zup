package com.zup.biblioteca.mapper;

import com.zup.biblioteca.dto.LivroComCriacaoDTO;
import com.zup.biblioteca.model.LivroModel;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface LivroMapper {

    LivroMapper INSTANCE = Mappers.getMapper( LivroMapper.class);

    LivroComCriacaoDTO livroParaLivroComCriacaoDTO(LivroModel livroModel);
}
