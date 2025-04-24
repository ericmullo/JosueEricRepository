// UsoTecnologiaProjection.java
package com.udla.arcane.jpa;

import org.springframework.data.rest.core.config.Projection;

@Projection(name="withDetails", types= { UsoTecnologia.class })
public interface UsoTecnologiaProjection {
    Long getId();
    Personaje getPersonaje();
    Tecnologia getTecnologia();
}
