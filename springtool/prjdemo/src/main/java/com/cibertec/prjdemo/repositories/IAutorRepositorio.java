package com.cibertec.prjdemo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cibertec.prjdemo.entities.AutorEntities;


@Repository
public interface IAutorRepositorio extends JpaRepository<AutorEntities, Long>{
	
	

}
