package edu.escuela.gamepz.personajes.malos;
import edu.escuela.gamepz.personajes.Personaje;
public class Zombie extends Personaje{
    boolean ataque;
    public Zombie(String nombre, int vida, boolean ataque){
        super(nombre, vida);
        this.ataque=ataque;
    }
}
