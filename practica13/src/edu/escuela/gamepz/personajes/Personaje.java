package edu.escuela.gamepz.personajes;
import java.text.DecimalFormat;
public abstract class Personaje implements Comparable<Personaje>{
	private String nombre;
	protected int vida=0;
	private float size;
	public Personaje (String nombre){
		this.nombre = nombre;
		setVida(3);
		size = 0.0f;
	}
	public Personaje (String nombre, int vida, float size){
		this.nombre = nombre;
		setVida(vida);
		if(size == 0.0f){
			this.size = genSize();
		} else{
			this.size = Math.round(size)/100;
		}
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
	public float getSize(){
		return size;
	}
	public String toString(){
		return nombre+"\t"+vida+"\t";
	}
	public float genSize(){
		float size = (float)Math.random()*10;
		DecimalFormat df = new DecimalFormat("#.00");
		size = Float.valueOf(df.format(size));
		return size;
	}
	public int compareTo(Personaje p){
		if(this.nombre.compareTo(p.nombre) != 0){
			return this.nombre.compareTo(p.nombre);
		}
		if(this.vida != p.vida){
			return this.vida - p.vida;
		}
		if(this.size == p.size){
			return 0;
		}
		return (this.size > p.size)? -1 : 1;
	}
	public abstract void decVida();
	public abstract void decVida(int dec);
	public abstract void addVida();
	public abstract void addVida(int add);

}
