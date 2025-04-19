package com.udla.arcane.jpa;

import jakarta.persistence.Embeddable;
import java.io.Serializable;
import java.util.Objects;

@Embeddable
public class AfiliacionId implements Serializable {

    private Long id_personaje;
    private Long id_organizacion;

    public AfiliacionId() {}

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof AfiliacionId)) return false;
        AfiliacionId that = (AfiliacionId) o;
        return Objects.equals(id_personaje, that.id_personaje) &&
                Objects.equals(id_organizacion, that.id_organizacion);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id_personaje, id_organizacion);
    }
}
