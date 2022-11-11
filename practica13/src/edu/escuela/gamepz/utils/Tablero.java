package edu.escuela.gamepz.utils;
import edu.escuela.gamepz.personajes.Personaje;
public class Tablero {
    public static final int MAX_SIZE = 10;
    private static Personaje[] personajes = new Personaje[MAX_SIZE];//hacer privado
    private Tablero(){}
    public static void mostrar(){
        System.out.println("\nInicio * * * Contenido del arreglo en Tablero");
        int x = 0;
        for (Personaje p : personajes) {
            String y = (personajes[x]==null)? x+" - - -" :x+" " + p;
            System.out.println(y);
            x++;
        }
        System.out.println("Fin * * * Contenido del arreglo en Tablero\n");
    }
    public static void insertar(Personaje p, int pos) throws PersException{
        if (0>pos || pos>=MAX_SIZE){
            throw new PersException("Fuera de rango", pos);
        } else{
            personajes[pos] = p;
        }
    }
    public static void borrar(int pos) throws PersException{
        if (0>pos || pos>=MAX_SIZE){
            throw new PersException("Fuera de rango", pos);
        } 
        if (personajes[pos]==null){
            throw new PersException("Sin personaje para borrar", pos);
        }
        personajes[pos] = null;
    }
    public static int genVida(){
        return (int)Math.random()*10;
    }
}
