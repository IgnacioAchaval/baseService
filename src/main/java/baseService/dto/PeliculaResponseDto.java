package baseService.dto;

//import baseService.model.Alquiler;
import baseService.model.Genero;
import common.dto.DtoEntity;


public class PeliculaResponseDto implements DtoEntity {
	
	private String titulo;
	private String sinopsis;
	private String anio;
	private Genero genero;
	private Long id;
	

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

	public void setAnio(String anio) {
		this.anio = anio;
	}

	public Genero getGenero() {
		return genero;
	}

	public void setGenero(Genero genero) {
		this.genero = genero;
	}
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	

}
