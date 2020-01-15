package com.marcos.IoC.almacenamiento.beans;

import org.springframework.context.annotation.Configuration;



public class AlmacenamientoDisco {

	private String path;
	private float tamanio;
	
	
	
	
	public String getPath() {
		return path;
	}
	public void setPath(String path) {
		this.path = path;
	}
	public float getTamanio() {
		return tamanio;
	}
	public void setTamanio(float tamanio) {
		this.tamanio = tamanio;
	}
	
	
	
	@Override
	public String toString() {
		return "AlmacenamientoDisco [path=" + path + ", tamanio=" + tamanio + "]";
	}
	
	
	
	
	
	
	
}
