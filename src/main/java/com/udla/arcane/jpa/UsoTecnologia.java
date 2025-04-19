package com.udla.arcane.jpa;

import jakarta.persistence.*;

@Entity
public class UsoTecnologia {

    @EmbeddedId
    private UsoTecnologiaId id;

    @ManyToOne
    @MapsId("id_personaje")
    private Personaje personaje;

    @ManyToOne
    @MapsId("id_tecnologia")
    private Tecnologia tecnologia;

    public UsoTecnologia() {}

    // Getters y setters
}
