package com.psl.valoraciones.mipension.model;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.LocalDateTime;

@Data
@Builder
@Entity
@Table(name = "REGISTRY")
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@ToString
public class RegistryEntity {

    @Id
    @GeneratedValue
    private Long id;
    private String registryLocation;
    private LocalDateTime registrationDate;
    private boolean isActive;

}
