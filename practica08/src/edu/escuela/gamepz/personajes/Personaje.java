package edu.escuela.gamepz.personajes; 

public class Personaje{
	private String nombre;
	private int vida=0;
	public Personaje (String nombre){
		this.nombre = nombre;
		setVida(3);
	}
	public Personaje (String nombre, int vida){
		this.nombre = nombre;
		setVida(vida);
	}
	public void setNombre(String nombre){
		int length = nombre.length();
		if (length>5 && length<25){
			this.nombre = nombre;
			setVida(vida);
		}
	}
	public boolean setVida(int vida){
		if (vida>=0 && vida<99){
			this.vida = vida;
			return true;
		}else{
			if (vida<0) {
				vida=0;//cuando se hace la resta y daria negativo o mayor a 99 deberia de ser el valor inicial, para eso se puede poner un if en add vida y decvida
			} else {
				vida=99;
			}
			return false;
		} 
	}
	public String getNombre(){
		return nombre;
	}
	public int getVida(){
		return vida;
	}
	public String getDetalle(){
		return nombre+"\t"+vida+"\t";
	}
	public void decVida(){
		setVida(vida-1);
	}
	public void decVida(int dec){
		setVida(vida-dec);
	}
	public void addVida(){
		setVida(vida+1);
	}
	public void addVida(int add){
		setVida(vida+add);
	}
}
