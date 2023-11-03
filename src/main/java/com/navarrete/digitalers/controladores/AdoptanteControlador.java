package com.navarrete.digitalers.controladores;

import com.navarrete.digitalers.entidades.Adoptante;
import com.navarrete.digitalers.servicios.AdoptanteServicioImpl;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(path = "/api/v1/adoptantes")
public class AdoptanteControlador extends ControladorImpl<Adoptante,AdoptanteServicioImpl> {
    public AdoptanteControlador(AdoptanteServicioImpl servicio) {
        super(servicio);
    }
}
