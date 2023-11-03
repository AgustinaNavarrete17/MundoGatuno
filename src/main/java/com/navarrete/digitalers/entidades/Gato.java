package com.navarrete.digitalers.entidades;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;

import java.time.LocalDate;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter

@Entity
@Table (name = "gatos")
public class Gato extends Entidad{
    @Column(name = "nombre", nullable = false)
    private String nombre;
    @Column(name = "edad", nullable = false)
    private String edad;
    @Column(name = "sexo", nullable = false)
    private String sexo;
    @Column(name = "peso")
    private String peso;
    @Column(name = "descripcion", nullable = false)
    private String descripcion;
    @Column(name = "color")
    private String color;
    @CreationTimestamp
    private LocalDate fecha_ingreso;
    @Column(name = "adoptado", nullable = false)
    private Boolean adoptado;
    @ManyToOne
    @JoinColumn(name = "idAdoptante", referencedColumnName = "id")
    private Adoptante adoptante;
}
