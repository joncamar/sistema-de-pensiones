package com.psl.valoraciones.mipension.repository;

import com.psl.valoraciones.mipension.model.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<UserEntity, String> {

    UserEntity findByIdAndIdNotNull(String id);

}
