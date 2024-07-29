package com.codigo.api_rest2.service.impl;

import com.codigo.api_rest2.dao.AutomovilDAO;
import com.codigo.api_rest2.entity.Automovil;
import com.codigo.api_rest2.request.VehiculoReq;
import com.codigo.api_rest2.service.AutomovilService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class AutomovilServiceImpl implements AutomovilService {
    @Autowired
    private AutomovilDAO automovilDAO;

    @Override
    public Automovil guardarAuto(VehiculoReq vehiculoReq) {

        Automovil automovil = new Automovil();

        automovil.setBrand(vehiculoReq.getBrand());
        automovil.setModelo(vehiculoReq.getModelo());
        automovil.setAnio(vehiculoReq.getAnio());
        automovil.setPlaca(vehiculoReq.getPlaca());
        automovil.setMarca(vehiculoReq.getMarca());
        automovil.setAsientos(vehiculoReq.getAsientos());
        automovil.setCombustible(vehiculoReq.getTipoCombustible());
        return automovilDAO.save(automovil);
    }
}
