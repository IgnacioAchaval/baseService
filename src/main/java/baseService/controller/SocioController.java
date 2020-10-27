package baseService.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;


import baseService.dto.SocioRequestDto;
import baseService.dto.SocioResponseDto;
import baseService.service.SocioService;

@Controller
@RequestMapping("/socio")
public class SocioController {
	
	@Autowired
    private SocioService socioService;
	
	@RequestMapping(method=RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE, produces= MediaType.APPLICATION_JSON_VALUE)
    public @ResponseBody SocioResponseDto insertSocio(@RequestBody SocioRequestDto request)
    {
        return socioService.insertSocio(request);
    }

}
