package com.rest.ducks;

import com.rest.ducks.interfaces.ICuackBehavior;
import com.rest.ducks.interfaces.IFlyBehavior;

public abstract class Duck {
	
	private String nombre;
	private IFlyBehavior flyBehavior;
	private ICuackBehavior cuackBehavior;
	
	public String cuack(){
		return this.cuackBehavior.hacerSonido();
	}
	
	public String volar(){
		return this.flyBehavior.volar();
	}
	
	public IFlyBehavior getFlyBehavior() {
		return flyBehavior;
	}
	public void setFlyBehavior(IFlyBehavior flyBehavior) {
		this.flyBehavior = flyBehavior;
	}
	public ICuackBehavior getCuackBehavior() {
		return cuackBehavior;
	}
	public void setCuackBehavior(ICuackBehavior cuackBehavior) {
		this.cuackBehavior = cuackBehavior;
	}
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
}
