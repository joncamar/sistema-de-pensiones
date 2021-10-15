package com.psl.valoraciones.mipension.mapper;

import com.psl.valoraciones.mipension.dto.RegistryDTO;
import com.psl.valoraciones.mipension.model.RegistryEntity;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface RegistryMapper {

    RegistryDTO entityToDto(RegistryEntity entity);

}
