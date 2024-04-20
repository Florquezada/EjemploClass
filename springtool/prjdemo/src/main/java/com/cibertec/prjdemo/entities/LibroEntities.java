package com.cibertec.prjdemo.entities;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToMany;
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
@Table (name = "libro")
public class LibroEntities extends BaseEntity {
	
	private String name;
	private String game;
	private int pages;
	@ManyToMany (cascade =CascadeType.REFRESH)
	
	private List<AutorEntities> autores;
	
	

}
