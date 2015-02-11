package com.rest.news;

import java.util.ArrayList;

public class AgenteNoticias {

	ArrayList<Periodico> listaObservers;
	
	public AgenteNoticias(){
		this.listaObservers = new ArrayList<Periodico>();
	}
	
	public void informarObservers(String noticia){
		for (Periodico p:listaObservers){
			p.actualizarPeriodico(noticia);
		}
	}
	public void suscribir(Periodico p){
		this.listaObservers.add(p);
	}
	public void eliminarSuscripcion(Periodico p){
		this.listaObservers.remove(p);
	}
}
