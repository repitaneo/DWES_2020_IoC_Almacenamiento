package com.marcos.IoC.almacenamiento.servicios.rutasTamanios;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;


@Component
@Qualifier("alumnado")
public class AlmacenamientoAlumnado implements Almacenamiento {

	@Override
	public String getRuta() {
		// TODO Auto-generated method stub
		return "/ficheros/alumnado";
	}

	@Override
	public float getTamanio() {
		// TODO Auto-generated method stub
		return 0.1f;
	}

	
	
	
}
