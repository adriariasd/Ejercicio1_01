package edu.escuela.gamepz.personajes.buenos;
import edu.escuela.gamepz.personajes.Personaje;
public class Planta extends Personaje{
    char escudo;
    public Planta(String nombre){
        super(nombre);
    }
    public char getEscudo(){
        return escudo;
    }
}