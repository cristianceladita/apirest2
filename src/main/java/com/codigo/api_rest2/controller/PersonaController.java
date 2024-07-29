package com.codigo.api_rest2.controller;

import com.codigo.api_rest2.entity.PersonaEntity;
import com.codigo.api_rest2.service.PersonaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/personas")

public class PersonaController {

    @Autowired
    private PersonaService personaService;

    @PostMapping("/grabar")
    public PersonaEntity crearPersona(@RequestBody PersonaEntity persona){
        return personaService.guardarPersona(persona);
    }
}
