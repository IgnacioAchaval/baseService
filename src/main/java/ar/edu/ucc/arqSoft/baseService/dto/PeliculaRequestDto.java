package ar.edu.ucc.arqSoft.baseService.dto;

import java.util.Set;

import ar.edu.ucc.arqSoft.baseService.model.Alquiler;
import ar.edu.ucc.arqSoft.baseService.model.Genero;
import ar.edu.ucc.arqSoft.common.dto.DtoEntity;


public class PeliculaRequestDto implements DtoEntity {
	

	private String titulo;
	private String sinopsis;
	private String anio;
	private Genero genero;
	private Set<Alquiler> alquileres;
	

	public Set<Alquiler> getAlquileres() {
		return alquileres;
	}

	public void setAlquileres(Set<Alquiler> alquileres) {
		this.alquileres = alquileres;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getSinopsis() {
		return sinopsis;
	}

	public void setSinopsis(String sinopsis) {
		this.sinopsis = sinopsis;
	}

	public String getAnio() {
		return anio;
	}

	public void setAno(String anio) {
		this.anio = anio;
	}

	public Genero getGenero() {
		return genero;
	}

	public void setGenero(Genero genero) {
		this.genero = genero;
	}
}

