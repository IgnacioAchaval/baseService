 package baseService.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import baseService.dto.AlquilerRequestDto;
import baseService.dto.AlquilerResponseDto;
import baseService.service.AlquilerService;

@Controller
@RequestMapping("/alquiler")
public class AlquilerController {

	@Autowired
	private AlquilerService alquilerService;

	@RequestMapping(method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public @ResponseBody AlquilerResponseDto registrar(@RequestBody AlquilerRequestDto request) {
		return alquilerService.registrarAlquiler(request);
	}
}
