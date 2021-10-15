package com.psl.valoraciones.mipension.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class RegistryDTO implements Serializable {

    private Long id;
    private String registryLocation;
    private LocalDateTime registrationDate;
    private boolean isActive;

}
