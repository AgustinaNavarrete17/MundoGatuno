package com.navarrete.digitalers.controladores;

import com.navarrete.digitalers.entidades.Entidad;
import com.navarrete.digitalers.servicios.ServicioImpl;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

public abstract class ControladorImpl<T extends Entidad, S extends ServicioImpl<T, Integer>> implements Controlador<T, Integer> {
    protected S servicio;

    protected final String ERROR = "Se produjo un Error! ";

    public ControladorImpl(S servicio) {
        this.servicio = servicio;
    }

    @GetMapping("/listar")
    public ResponseEntity<?> listarTodo() {
        try {
            return ResponseEntity.status(HttpStatus.OK).body(servicio.listarTodo());
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(this.ERROR);
        }
    }

    @GetMapping("/listarPorId/{id}")
    public ResponseEntity<?> listarPorID(@PathVariable Integer id) {
        try {
            return ResponseEntity.status(HttpStatus.OK).body(servicio.listarPorID(id));
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(this.ERROR);
        }
    }

    @PostMapping("/crear")
    public ResponseEntity<?> guardar(@RequestBody T entidad) {
        try {
            return ResponseEntity.status(HttpStatus.OK).body(servicio.guardar(entidad));
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(this.ERROR);
        }
    }

    @PutMapping("/actualizar")
    public ResponseEntity<?> actualizar(@RequestBody T entidad) {
        try {
            return ResponseEntity.status(HttpStatus.OK).body(servicio.actualizar(entidad));
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(this.ERROR);
        }
    }
    @DeleteMapping("/eliminar/{id}")
    public ResponseEntity<?> eliminar(@PathVariable Integer id) {
        try {
            return ResponseEntity.status(HttpStatus.NO_CONTENT).body(servicio.eliminar(id));
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(this.ERROR);
        }
    }}
