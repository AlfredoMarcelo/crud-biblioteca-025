package cl.aiep.java.biblioteca.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Autor {
	
	@Id
	@GeneratedValue( strategy = GenerationType.AUTO)
	private Long id;
	private String nombre;
	@ManyToOne
	private Libro libro;
	
	//private String imagen;
	

}
