package com.udla.arcane.jpa;

import jakarta.persistence.*;
import java.util.List;

@Entity
public class Tecnologia {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_tecnologia;

    private String nombre;
    private String tipo;
    private String descripcion;

    @OneToMany(mappedBy = "tecnologia")
    private List<UsoTecnologia> personajesQueLaUsan;

    public Tecnologia() {}

    // Getters y setters
}
