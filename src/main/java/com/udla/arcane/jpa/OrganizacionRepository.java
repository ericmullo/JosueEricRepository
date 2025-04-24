/* OrganizacionRepository.java */
package com.udla.arcane.jpa;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;


@RepositoryRestResource(path="organizaciones", collectionResourceRel="organizaciones")
public interface OrganizacionRepository extends JpaRepository<Organizacion, Long> { }
