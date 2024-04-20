package com.cibertec.prjdemo.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table (name = "Domicilio")

public class DomicilioEntities extends BaseEntity{
	
	private  String street;
	private int Number;
	
	//RELACIONES//
	@ManyToOne
	@JoinColumn (name="fk_localidad")
    private LocalidadEntities localidad;

	

}
