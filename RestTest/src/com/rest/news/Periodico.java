package com.rest.news;

import java.util.ArrayList;

public class Periodico {
	
	private ArrayList<String> listaNoticias;
	
	public Periodico(){
		this.listaNoticias = new ArrayList<String>();
	}
	
	public String actualizarPeriodico(String noticia){
		
		this.listaNoticias.add(noticia);
		
		StringBuffer result= new StringBuffer();
		for(String not:listaNoticias){
			result.append(not+"\n");
		}
		
		if(listaNoticias.size()>0){
			return result.toString();
		}else{
			return "No hay noticias todavia.";
		}
	}

}
