package com.howtodoinjava.dom;

public class Persona {

	private Long id;
	private String name;
	private String countryId;
	
	public Persona(Long id, String name, String cId){
		this.id=id;
		this.name=name;
		this.countryId=cId;
	}
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCountryId() {
		return countryId;
	}
	public void setCountryId(String countryId) {
		this.countryId = countryId;
	}
	
	
}