package com.navarrete.digitalers.controladores;

import com.navarrete.digitalers.entidades.Gato;
import com.navarrete.digitalers.servicios.GatoServicioImpl;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(path = "/api/v1/gatos")
public class GatoControlador extends ControladorImpl<Gato, GatoServicioImpl>{
    public GatoControlador(GatoServicioImpl servicio) {
        super(servicio);
    }
}
