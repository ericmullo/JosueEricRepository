package com.udla.arcane.jpa;

import jakarta.persistence.Embeddable;
import java.io.Serializable;
import java.util.Objects;

@Embeddable
public class RelacionId implements Serializable {

    private Long id_personaje_a;
    private Long id_personaje_b;

    public RelacionId() {}

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof RelacionId)) return false;
        RelacionId that = (RelacionId) o;
        return Objects.equals(id_personaje_a, that.id_personaje_a) &&
                Objects.equals(id_personaje_b, that.id_personaje_b);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id_personaje_a, id_personaje_b);
    }
}
