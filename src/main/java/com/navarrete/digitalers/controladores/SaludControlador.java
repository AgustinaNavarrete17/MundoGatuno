package com.navarrete.digitalers.controladores;

import com.navarrete.digitalers.entidades.Salud;
import com.navarrete.digitalers.servicios.SaludServicioImpl;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(path = "/api/v1/salud")
public class SaludControlador extends ControladorImpl<Salud, SaludServicioImpl>{
    public SaludControlador(SaludServicioImpl servicio){
        super(servicio);
    }
}
