package com.codigo.api_rest2.controller;


import com.codigo.api_rest2.entity.Automovil;
import com.codigo.api_rest2.entity.PersonaEntity;
import com.codigo.api_rest2.request.VehiculoReq;
import com.codigo.api_rest2.service.AutomovilService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/vehiculos")
public class VehiculoController {

    @Autowired
    private AutomovilService automovilService;

    @PostMapping("/grabar")
    public Automovil crearVehiculo(@RequestBody VehiculoReq vehiculoReq){
        return automovilService.guardarAuto(vehiculoReq);
    }
}
