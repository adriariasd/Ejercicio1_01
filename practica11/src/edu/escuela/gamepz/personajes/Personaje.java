package edu.escuela.gamepz.personajes; 
public abstract class Personaje{
	private String nombre;
	protected int vida=0;
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
		if (vida>=0 && vida<100){
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
	public String toString(){
		return nombre+"\t"+vida+"\t";
	}

	public abstract void decVida();
	public abstract void decVida(int dec);
	public abstract void addVida();
	public abstract void addVida(int add);

}
