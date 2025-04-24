// RelacionProjection.java
package com.udla.arcane.jpa;

import org.springframework.data.rest.core.config.Projection;

@Projection(name="withDetails", types= { Relacion.class })
public interface RelacionProjection {
    Long getId();
    Personaje getPersonajeA();
    Personaje getPersonajeB();
    String getTipoRelacion();
}
