package com.marcos.IoC.almacenamiento.servicios.rutasTamanios;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;


@Component
@Qualifier("profesorado")
public class AlmacenamientoProfesorado implements Almacenamiento {

	@Override
	public String getRuta() {
		// TODO Auto-generated method stub
		return "/ficheros/profesorado";
	}

	@Override
	public float getTamanio() {
		// TODO Auto-generated method stub
		return 3f;
	}
	
	
	
}
