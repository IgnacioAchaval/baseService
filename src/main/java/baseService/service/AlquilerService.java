package baseService.service;

import java.util.Calendar;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import baseService.dao.AlquilerDao;
import baseService.dao.PeliculaDao;
import baseService.dao.SocioDao;
import baseService.dto.AlquilerRequestDto;
import baseService.dto.AlquilerResponseDto;
import baseService.model.Alquiler;

@Service
@Transactional
public class AlquilerService {
	
	@Autowired
	private AlquilerDao alquilerDao;
	
	@Autowired
	private PeliculaDao peliculaDao;
	
	@Autowired
	private SocioDao socioDao;
	
	
	public AlquilerResponseDto registrarAlquiler (AlquilerRequestDto dto) {
		
		Alquiler alquiler = new Alquiler();
		
		alquiler.setFechaAlquiler(Calendar.getInstance().getTime());
		alquiler.setPelicula(peliculaDao.load(dto.getPeliculaId()));
		alquiler.setSocio(socioDao.load(dto.getSocioId()));
		
		alquilerDao.insert(alquiler);
		
		AlquilerResponseDto response = new AlquilerResponseDto();
		
		response.setApellido(alquiler.getSocio().getApellido());
		response.setTitulo(alquiler.getPelicula().getTitulo());
		response.setFecha(alquiler.getFechaAlquiler());
		
		return response;
		
	}
	

	
}
