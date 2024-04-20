package com.cibertec.prjdemo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cibertec.prjdemo.entities.PersonaEntities;



@Repository
public interface IPersonaRepositorio extends JpaRepository<PersonaEntities, Long> {

}
