package com.marcos.IoC.almacenamiento;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.marcos.IoC.almacenamiento.servicios.rutasTamanios.Almacenamiento;

@Controller
public class RutasAlmacenamiento {
	
	@Autowired
	@Qualifier("alumnado")
	Almacenamiento alumnado;

	
	@Autowired
	@Qualifier("profesorado")
	Almacenamiento profesorado;
			
	
	@GetMapping("/almacenamientoalumnado")
	@ResponseBody
	public String espacioAlumnado() {
	
		return alumnado.getRuta()+" "+alumnado.getTamanio();
	}	
	
	
	@GetMapping("/almacenamientoprofesorado")
	@ResponseBody
	public String espacioProfesorado() {
	
		return profesorado.getRuta()+" "+profesorado.getTamanio();
	}	
}
