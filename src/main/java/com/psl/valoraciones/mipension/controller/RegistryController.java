package com.psl.valoraciones.mipension.controller;

import com.psl.valoraciones.mipension.dto.RegistryDTO;
import com.psl.valoraciones.mipension.service.RegisteredUserService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("registries")
public class RegistryController {

    private final RegisteredUserService registeredUserService;

    public RegistryController(RegisteredUserService registeredUserService) {
        this.registeredUserService = registeredUserService;
    }

    /**
     * TODO: 1. Arreglar el endpoint porque no está funcionando :(
     * @param id
     * @return
     */
    @GetMapping("user/{id}")
    public ResponseEntity<List<RegistryDTO>> getRegistriesByUser(@PathVariable String id) {
        return ResponseEntity.ok(registeredUserService.getRegistriesByUser(id));
    }

}
