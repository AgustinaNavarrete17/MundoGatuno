package com.navarrete.digitalers.controladores;

import com.navarrete.digitalers.entidades.Comportamiento;
import com.navarrete.digitalers.servicios.ComportamientoServicioImpl;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(path = "/api/v1/comportamiento")
public class ComportamientoControlador extends ControladorImpl<Comportamiento, ComportamientoServicioImpl> {
    public ComportamientoControlador(ComportamientoServicioImpl servicio) {
        super(servicio);
    }
}
