package com.psl.valoraciones.mipension.model;

import lombok.*;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;
import java.util.UUID;

@Data
@Builder
@Entity
@Table(name = "USER")
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@ToString
public class UserEntity {

    @Id
    @Builder.Default
    private String id = UUID.randomUUID().toString();
    private String firstname;
    private String lastname;
    private LocalDate birthdate;

    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(name = "USER_REGISTRY",
        joinColumns = @JoinColumn(name = "USER_ID", referencedColumnName = "id"),
        inverseJoinColumns = @JoinColumn(name = "REGISTRY_ID", referencedColumnName = "id"))
    private List<RegistryEntity> registries;

}
