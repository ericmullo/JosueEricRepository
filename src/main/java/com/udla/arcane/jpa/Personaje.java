package com.udla.arcane.jpa;

import jakarta.persistence.*;
import java.util.List;

@Entity
public class Personaje {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_personaje;

    private String nombre;
    private String origen;
    private String rol;
    private String alineacion;

    @OneToMany(mappedBy = "personaje")
    private List<Afiliacion> afiliaciones;

    @OneToMany(mappedBy = "personaje")
    private List<UsoTecnologia> tecnologiasUsadas;

    @OneToMany(mappedBy = "personajeA")
    private List<Relacion> relaciones;

    public Personaje() {}

    // Getters y setters
}
