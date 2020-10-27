package baseService.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import baseService.dao.PeliculaDao;
import baseService.dto.PeliculaResponseDto;
import baseService.model.Pelicula;
import common.dto.ModelDtoConverter;


@Service
@Transactional
public class PeliculaService {
	
	
	@Autowired
	private PeliculaDao peliculaDao;
	
	
	public PeliculaResponseDto getPeliculaById (Long id) {
		
		Pelicula pelicula = peliculaDao.load(id);
		
		PeliculaResponseDto dto = (PeliculaResponseDto) new ModelDtoConverter().convertToDto(pelicula, new PeliculaResponseDto());
		dto.setTitulo(pelicula.getTitulo());
		dto.setGenero(pelicula.getGenero());
		dto.setAnio(pelicula.getAnio());
		dto.setSinopsis(pelicula.getSinopsis());
		dto.setId(pelicula.getId());
		
		return dto;
	}
	
	public List<PeliculaResponseDto> getAllMovies() {
		List<Pelicula> peliculas = peliculaDao.getAll();
		
		List<PeliculaResponseDto> response = new ArrayList<PeliculaResponseDto>();
		
		for (Pelicula pelicula : peliculas) {
			response.add((PeliculaResponseDto) new ModelDtoConverter().convertToDto(pelicula, new PeliculaResponseDto()));
		}
		
		return response;
	}

}
