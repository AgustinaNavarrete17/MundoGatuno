package com.navarrete.digitalers.servicios;

import com.navarrete.digitalers.entidades.Adoptante;
import com.navarrete.digitalers.entidades.Alimentacion;
import com.navarrete.digitalers.repositorios.AlimentacionRepositorio;
import com.navarrete.digitalers.repositorios.Repositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AlimentacionServicioImpl extends ServicioImpl<Alimentacion, Integer> implements AlimentacionServicio{
    @Autowired
    private AlimentacionRepositorio alimentacionRepositorio;


    public AlimentacionServicioImpl(Repositorio<Alimentacion, Integer> repositorio) {
        super(repositorio);
    }
}
