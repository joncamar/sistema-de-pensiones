package com.psl.valoraciones.mipension.service;

import com.psl.valoraciones.mipension.dto.RegistryDTO;
import com.psl.valoraciones.mipension.mapper.RegistryMapper;
import com.psl.valoraciones.mipension.model.RegistryEntity;
import com.psl.valoraciones.mipension.model.UserEntity;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

@Slf4j
@Service
public class RegisteredUserService {

    private final UserService userService;
    private final RegistryMapper registryMapper;

    public RegisteredUserService(UserService userService, RegistryMapper registryMapper) {
        this.userService = userService;
        this.registryMapper = registryMapper;
    }

    /**
     * TODO: 3. (opcional) Reescribir este metodo para que use streams
     * Obtener la lista de registros activos que tiene un usuario de forma activa
     * @param id Id del usuario
     * @return Lista de los registros que realizo el usuario
     */
    public List<RegistryDTO> getRegistriesByUser(String id) {
        UserEntity userById = userService.getUserById(id);
        if (Objects.nonNull(userById)) {
            List<RegistryEntity> registries = userById.getRegistries();
            List<RegistryDTO> result = new ArrayList<>(registries.size());
            for (RegistryEntity registry : registries) {
                if (registry.isActive()) {
                    RegistryDTO registryDTO = registryMapper.entityToDto(registry);
                    result.add(registryDTO);
                }
            }
            return result;
        } else {
            return new ArrayList<>(0);
        }
    }
}
