package com.navarrete.digitalers.servicios;

import com.navarrete.digitalers.entidades.Comportamiento;
import com.navarrete.digitalers.repositorios.ComportamientoRepositorio;
import com.navarrete.digitalers.repositorios.Repositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ComportamientoServicioImpl extends ServicioImpl<Comportamiento, Integer> implements ComportamientoServicio {
    @Autowired
    private ComportamientoRepositorio comportamientoRepositorio;


    public ComportamientoServicioImpl(Repositorio<Comportamiento, Integer> repositorio) {
        super(repositorio);
    }
}
