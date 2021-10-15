package com.psl.valoraciones.mipension.controller;

import com.psl.valoraciones.mipension.model.RegistryEntity;
import com.psl.valoraciones.mipension.model.UserEntity;
import com.psl.valoraciones.mipension.service.RegisteredUserService;
import com.psl.valoraciones.mipension.service.UserService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.boot.test.mock.mockito.SpyBean;
import org.springframework.test.web.servlet.MockMvc;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import static org.hamcrest.Matchers.containsString;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@WebMvcTest(RegistryController.class)
class RegistryControllerTest {

    private static final String USER_ID = "UUID";
    private static final String PATH = "registries/user";

    @Autowired
    private MockMvc mockMvc;

    @SpyBean
    private RegisteredUserService registeredUserService;

    @MockBean
    private UserService userService;

    @Test
    void shouldGetRegistriesByUser() throws Exception {
        List<RegistryEntity> registries = new ArrayList<>(1);
        RegistryEntity registryEntity = RegistryEntity.builder()
                .id(1L)
                .registryLocation("Colombia")
                .build();
        registries.add(registryEntity);
        when(userService.getUserById(USER_ID))
                .thenReturn(UserEntity.builder()
                        .id(USER_ID)
                        .registries(registries)
                        .build());

        this.mockMvc.perform(get(PATH.concat(USER_ID)))
                .andDo(print())
                .andExpect(status().isOk())
                .andExpect(content().string(containsString(USER_ID)))
                .andExpect(content().string(containsString("Colombia")));
    }

}