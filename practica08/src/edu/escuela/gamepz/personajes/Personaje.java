package edu.escuela.gamepz.personajes; 

public class Personaje{
	private String nombre;
	private int vida=0;
	public Personaje (String nombre){
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
		if (vida>0 && vida<99){
			this.vida = vida;
			return true;
		}else{
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
}
