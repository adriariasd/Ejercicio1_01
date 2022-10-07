package edu.escuela.gamepz.personajes.buenos;
import edu.escuela.gamepz.personajes.Personaje;
public class Planta extends Personaje{
    char escudo;
    public Planta(String nombre, int vida, char escudo){
        super(nombre, vida);
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
    public char getEscudo(){
        return escudo;
    }
}