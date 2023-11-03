package com.navarrete.digitalers.entidades;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter

@Entity
@Table(name = "comportamientos")
public class Comportamiento extends Entidad{
 @Column(name = "nombre", nullable = false)
 private String nombre;
 @Column(name = "descripcion", nullable = false)
 private String descripcion;
 @Column(name = "sugerencia")
 private String sugerencia;
}
