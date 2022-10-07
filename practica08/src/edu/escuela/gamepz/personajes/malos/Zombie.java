package edu.escuela.gamepz.personajes.malos;
import edu.escuela.gamepz.personajes.Personaje;
public class Zombie extends Personaje{
    boolean ataque;
    public Zombie(String nombre, int vida, boolean ataque){
        super(nombre, vida);
        this.ataque=ataque;
    }
    public Zombie(String nombre, boolean ataque){
        this(nombre, 3, ataque);
    }
    public Zombie(String nombre){
        this(nombre, 3, false);
    }
    public void decVida(){
		if (ataque==false) {
            super.decVida(3);
        } else {
            super.decVida(2);
        }
	}
	public void decVida(int dec){
		if (ataque==false) {
            super.decVida(dec*3);
        } else {
            super.decVida(dec*2);
        }
	}
    public void addVida(){
		if (ataque==false) {
        } else {
            super.addVida(3);
        }
	}
	public void addVida(int add){
		if (ataque==false) {
        } else {
            super.addVida(add*3);
        }
	}
    public String getDetalle(){
        return super.getDetalle()+" "+ataque;
    }
    public boolean getAtaque(){
        return ataque;
    }
}
