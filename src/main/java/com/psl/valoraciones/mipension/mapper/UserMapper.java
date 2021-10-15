package com.psl.valoraciones.mipension.mapper;

import com.psl.valoraciones.mipension.dto.UserDTO;
import com.psl.valoraciones.mipension.model.UserEntity;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface UserMapper {

    UserDTO entityToDto(UserEntity entity);

}
