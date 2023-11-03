package com.navarrete.digitalers.servicios;

import com.navarrete.digitalers.entidades.Entidad;

import java.io.Serializable;
import java.util.List;

public interface Servicio <T extends Entidad, N extends Serializable> {
  List<T> listarTodo() throws Exception;

  T listarPorID(N id) throws Exception;

  T guardar(T entidad) throws Exception;

  T actualizar(T entidad) throws Exception;

  Boolean eliminar(N id) throws Exception;
}
