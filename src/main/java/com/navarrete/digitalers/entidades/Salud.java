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
@Getter
@Setter

@Entity
@Table(name = "salud")
public class Salud extends Entidad {
 @Column(name = "nombre", nullable = false)
 private String nombre;
 @Column(name = "descripcion", nullable = false)
 private String descripcion;
 @Column(name = "tratamiento")
 private String tratamiento;
}
