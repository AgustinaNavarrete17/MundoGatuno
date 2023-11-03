package com.navarrete.digitalers.controladores;

import com.navarrete.digitalers.entidades.Entidad;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import java.io.Serializable;

public interface Controlador<T extends Entidad, N extends Serializable> {
    ResponseEntity<? extends Object> listarTodo();

    ResponseEntity<? extends Object> listarPorID(@PathVariable N id);

    ResponseEntity<? extends Object> guardar(@RequestBody T entidad);

    ResponseEntity<? extends Object> actualizar(@RequestBody T entidad);

    ResponseEntity<? extends Object> eliminar(@PathVariable N id);
}
