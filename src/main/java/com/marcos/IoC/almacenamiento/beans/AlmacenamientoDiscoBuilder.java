package com.marcos.IoC.almacenamiento.beans;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;


@Configuration
public class AlmacenamientoDiscoBuilder {

	@Bean(name="almacenamientoProfesorado")
	public AlmacenamientoDisco profesorado() {
		
		AlmacenamientoDisco rutaEspacio = new AlmacenamientoDisco();
		rutaEspacio.setPath("/ficheros/profesorado");
		rutaEspacio.setTamanio(3.0f);
		
		return rutaEspacio;
	}
	
	
	
	@Bean(name="almacenamientoAlumnado")
	public AlmacenamientoDisco alumnado() {
		
		AlmacenamientoDisco rutaEspacio = new AlmacenamientoDisco();
		rutaEspacio.setPath("/ficheros/alumnado");
		rutaEspacio.setTamanio(0.1f);

		
		return rutaEspacio;
	}	
	
	
}
