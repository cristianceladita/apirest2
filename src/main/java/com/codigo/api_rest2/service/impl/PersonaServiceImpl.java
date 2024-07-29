package com.codigo.api_rest2.service.impl;

import com.codigo.api_rest2.dao.PersonaDAO;
import com.codigo.api_rest2.entity.PersonaEntity;
import com.codigo.api_rest2.service.PersonaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonaServiceImpl implements PersonaService {

    @Autowired
    private PersonaDAO personaDAO;

    @Override
    public PersonaEntity guardarPersona(PersonaEntity persona) {
        return personaDAO.save(persona);
    }

    @Override
    public PersonaEntity actualizarPersona(PersonaEntity persona) {
        return null;
    }
}
