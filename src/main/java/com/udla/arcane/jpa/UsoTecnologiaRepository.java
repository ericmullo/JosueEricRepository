/* UsoTecnologiaRepository.java */
package com.udla.arcane.jpa;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path="usoTecnologias", collectionResourceRel="usoTecnologias")

public interface UsoTecnologiaRepository extends JpaRepository<UsoTecnologia, UsoTecnologiaId> { }
