package edu.escuela.gamepz.utils;
import edu.escuela.gamepz.personajes.Personaje;
public class Tablero {
    public static final int MAX_SIZE = 10;
    public Personaje[] personajes = new Personaje[MAX_SIZE];
    private Tablero(){}
    public void mostrar(){
        System.out.println("\nInicio * * * Contenido del arreglo en Tablero");
        int x = 0;
        for (Personaje p : personajes) {
            String y = (personajes[x]==null)? x+"- - -" : ""+x + p;
            System.out.println(y);
            x++;
        }
        System.out.println("Fin * * * Contenido del arreglo en Tablero\n");
    }
    public void insertar(Personaje p, int pos) throws PersException{
        if (0>pos || pos>MAX_SIZE){
            throw new PersException("Fuera de rango", pos);
        } else{
            personajes[pos] = p;
        }
    }
    public void borrar(int pos) throws PersException{
        if (0>pos || pos>MAX_SIZE){
            throw new PersException("Fuera de rango", pos);
        } 
        if (personajes[pos]==null){
            throw new PersException("Sin personaje para borrar", pos);
        }
        personajes[pos] = null;
    }
}
