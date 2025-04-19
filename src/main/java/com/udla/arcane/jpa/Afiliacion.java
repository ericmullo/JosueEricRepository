package com.udla.arcane.jpa;

import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
public class Afiliacion {

    @EmbeddedId
    private AfiliacionId id;

    @ManyToOne
    @MapsId("id_personaje")
    private Personaje personaje;

    @ManyToOne
    @MapsId("id_organizacion")
    private Organizacion organizacion;

    private String rol;
    private LocalDate fecha_ingreso;

    public Afiliacion() {}

    // Getters y setters
}
