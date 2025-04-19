package com.udla.arcane.jpa;

import jakarta.persistence.Embeddable;
import java.io.Serializable;
import java.util.Objects;

@Embeddable
public class UsoTecnologiaId implements Serializable {

    private Long id_personaje;
    private Long id_tecnologia;

    public UsoTecnologiaId() {}

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof UsoTecnologiaId)) return false;
        UsoTecnologiaId that = (UsoTecnologiaId) o;
        return Objects.equals(id_personaje, that.id_personaje) &&
                Objects.equals(id_tecnologia, that.id_tecnologia);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id_personaje, id_tecnologia);
    }
}
