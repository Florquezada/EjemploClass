package com.cibertec.prjdemo.entities;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table (name = "autor")
public class AutorEntities extends BaseEntity {
	
	//tipo de dato 
	@Column(columnDefinition ="CHAR(20)",nullable =false)
	private String name;
	
	//nombre y tamaño
	@Column(name ="lastname", length =50)
	private String lastName;
}
