package com.navarrete.digitalers.entidades;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter

@Entity
@Table(name = "adoptantes")
public class Adoptante extends Entidad{
 @Column(name = "nombre", nullable = false)
 private String nombre;
 @Column(name = "apellido", nullable = false)
 private String apellido;
 @Column(name = "telefono", nullable = false)
 private Long telefono;
 @Column(name = "edad", nullable = false)
 private Integer edad;
 @Column(name = "direccion", nullable = false)
 private String direccion;

}
