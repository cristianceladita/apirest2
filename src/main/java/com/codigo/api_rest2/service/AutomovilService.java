package com.codigo.api_rest2.service;

import com.codigo.api_rest2.entity.Automovil;
import com.codigo.api_rest2.request.VehiculoReq;

public interface AutomovilService {

    Automovil guardarAuto(VehiculoReq vehiculoReq);

}
