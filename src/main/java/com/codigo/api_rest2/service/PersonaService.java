package com.codigo.api_rest2.service;

import com.codigo.api_rest2.entity.PersonaEntity;

public interface PersonaService {
    PersonaEntity guardarPersona(PersonaEntity persona);
    PersonaEntity actualizarPersona(PersonaEntity persona);

}
