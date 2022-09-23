package edu.escuela.gamepz.personajes; 

public class Personaje{
	private String nombre;
	private int edad;
	public void setNombre(String nombre){
		int length = nombre.length();
		if (length>5 && length<25){
		this.nombre = nombre;
		setEdad(edad);
	}
	}
	public Personaje (String nombre, int edad){
		this.nombre = nombre;
		setEdad(edad);
	}
	public boolean setEdad(int edad){
		if (edad>0 && edad<120){
			this.edad = edad;
			return true;
		}else{
			return false;
		} 
	}
	public String getNombre(){
		return nombre;
	}
	public int getEdad(){
		return edad;
	}
	public String getDetalle(){
		return nombre+"\t"+edad;
	}
}

//javac -d ../classes edu/escuela/gamepz/pruebas/PruebaPersonaje.java
//java -cp ..\classes edu\escuela\gamepz\pruebas\PruebaPersonaje 