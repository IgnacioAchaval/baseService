package baseService.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import baseService.dao.SocioDao;
import baseService.dto.SocioRequestDto;
import baseService.dto.SocioResponseDto;
import baseService.model.Socio;
import common.dto.ModelDtoConverter;

@Service
@Transactional
public class SocioService {
	
	@Autowired
	private SocioDao socioDao;

	
	public SocioResponseDto insertSocio(SocioRequestDto request) {
		
		Socio socio = (Socio) new ModelDtoConverter().convertToEntity(new Socio(), request);
		
		socioDao.insert(socio);
		
		SocioResponseDto response = (SocioResponseDto) new ModelDtoConverter().convertToDto(socio, new SocioResponseDto());	
		
		return response;
	}

}
