package com.navarrete.digitalers.servicios;

import com.navarrete.digitalers.entidades.Gato;
import com.navarrete.digitalers.repositorios.GatoRepositorio;
import com.navarrete.digitalers.repositorios.Repositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GatoServicioImpl extends ServicioImpl<Gato, Integer> implements GatoServicio {
    @Autowired
    private GatoRepositorio gatoRepositorio;


    public GatoServicioImpl(Repositorio<Gato, Integer> repositorio) {
        super(repositorio);
    }
}
