package com.udla.arcane.jpa;

import jakarta.persistence.*;

@Entity
public class Relacion {

    @EmbeddedId
    private RelacionId id;

    @ManyToOne
    @MapsId("id_personaje_a")
    private Personaje personajeA;

    @ManyToOne
    @MapsId("id_personaje_b")
    private Personaje personajeB;

    private String tipo_relacion;

    public Relacion() {}

    // Getters y setters
}
