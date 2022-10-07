package edu.escuela.gamepz.personajes.buenos;
import edu.escuela.gamepz.personajes.Personaje;
public class Planta extends Personaje{
    char escudo;
    public Planta(String nombre, int vida, char escudo){
        super(nombre, vida);
        this.escudo = escudo;
    }
    public Planta(String nombre, char escudo){
        this(nombre, 3, escudo);
    }
    public Planta(String nombre, int vida){
        this(nombre, vida, 'A');
    }
    public Planta(String nombre){
        this(nombre, 3, 'A');
    }
    public void decVida(){
		super.setVida(vida-1);
	}
	public void decVida(int dec){
		setVida(vida-dec);
	}
    public String getDetalle(){
		return super.getDetalle()+" "+escudo;
	}
    public char getEscudo(){
        return escudo;
    }
}