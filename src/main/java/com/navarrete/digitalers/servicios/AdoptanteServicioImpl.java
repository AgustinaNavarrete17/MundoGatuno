package com.navarrete.digitalers.servicios;

import com.navarrete.digitalers.entidades.Adoptante;
import com.navarrete.digitalers.repositorios.AdoptanteRepositorio;
import com.navarrete.digitalers.repositorios.Repositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AdoptanteServicioImpl extends ServicioImpl<Adoptante,Integer> implements AdoptanteServicio {
    @Autowired
    private AdoptanteRepositorio estudianteRepositorio;


    public AdoptanteServicioImpl(Repositorio<Adoptante, Integer> repositorio) {
        super(repositorio);
    }
}
