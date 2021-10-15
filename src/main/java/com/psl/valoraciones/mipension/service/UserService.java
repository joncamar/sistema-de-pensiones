package com.psl.valoraciones.mipension.service;

import com.psl.valoraciones.mipension.model.UserEntity;
import com.psl.valoraciones.mipension.repository.UserRepository;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
@AllArgsConstructor
public class UserService {

    private final UserRepository userRepository;

    public UserEntity getUserById(String id) {
        return userRepository.findByIdAndIdNotNull(id);
    }

}
