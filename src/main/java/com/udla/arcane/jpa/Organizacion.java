package com.udla.arcane.jpa;

import jakarta.persistence.*;
import java.util.List;

@Entity
public class Organizacion {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_organizacion;

    private String nombre;
    private String ciudad_base;
    private String tipo;

    @OneToMany(mappedBy = "organizacion")
    private List<Afiliacion> afiliaciones;

    public Organizacion() {}

    // Getters y setters
}
