package com.navarrete.digitalers.servicios;

import com.navarrete.digitalers.entidades.Salud;
import com.navarrete.digitalers.repositorios.Repositorio;
import com.navarrete.digitalers.repositorios.SaludRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SaludServicioImpl extends ServicioImpl<Salud, Integer> implements SaludServicio {
    @Autowired
    private SaludRepositorio saludRepositorio;


    public SaludServicioImpl(Repositorio<Salud, Integer> repositorio) {
        super(repositorio);
    }
}
