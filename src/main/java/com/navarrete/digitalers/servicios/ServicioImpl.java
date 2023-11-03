package com.navarrete.digitalers.servicios;

import com.navarrete.digitalers.entidades.Entidad;
import com.navarrete.digitalers.repositorios.Repositorio;
import jakarta.transaction.Transactional;

import java.io.Serializable;
import java.util.List;
import java.util.Optional;

public abstract class ServicioImpl<T extends Entidad, N extends Serializable> implements Servicio<T, N>{
    protected Repositorio<T, N> repositorio;

    public ServicioImpl(Repositorio<T, N> repositorio) {
        this.repositorio = repositorio;
    }

    @Override
    @Transactional
    public List<T> listarTodo() throws Exception {
        try {
            return repositorio.findAll();
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }

    }

    @Override
    @Transactional
    public T listarPorID(N id) throws Exception {
        try {
            Optional<T> optional = repositorio.findById(id);
            return optional.get();
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }

    }

    @Override
    @Transactional
    public T guardar(T entidad) throws Exception {
        try {
            return repositorio.save(entidad);
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }

    }

    @Override
    @Transactional
    public T actualizar(T entidad) throws Exception {
        try {
            return repositorio.save(entidad);
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }

    @Override
    @Transactional
    public Boolean eliminar(N id) throws Exception {
        try {
            if (repositorio.existsById(id)) {
                repositorio.deleteById(id);
                return Boolean.TRUE;
            } else {
                throw new Exception();
            }
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }

    }
}
