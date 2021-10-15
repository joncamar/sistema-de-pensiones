package com.psl.valoraciones.mipension.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class UserDTO implements Serializable {

    private String id;
    private String firstname;
    private String lastname;
    private Long age;
    private LocalDate birthDate;
    private boolean isLastnamePalindrome;

}
