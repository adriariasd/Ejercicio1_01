package edu.escuela.gamepz.pruebas;
import static edu.escuela.gamepz.utils.Escudo.*;
import edu.escuela.gamepz.utils.*;
import edu.escuela.gamepz.personajes.*;
import edu.escuela.gamepz.personajes.buenos.*;
import edu.escuela.gamepz.personajes.malos.*;
public class PruebaTablero {
    public static void main(String[] args) {
        Personaje[] datos={
            new Planta("David",100),
            new Zombie("Bianca"),
            new Planta("Fabian",10,MEDIO),   
            new Planta("Almendra",50),
            new Planta("Ricardo",BAJO),
            new Planta("Silvia"),
            new Zombie("Armando",80,false),
            new Zombie("Josseline",true),
            new Zombie("Eduardo")
        };
        for (Personaje p : datos) {
            int n = (int)(Math.random()*20-5);
            try{
                Tablero.insertar(p,n);
            } catch (PersException pe){
                System.err.println(pe.getMessage()+" "+pe.pos);
            }
        }
        Tablero.mostrar();
        for (int i = 0; i < Tablero.MAX_SIZE; i++) {
            int x = (int)(Math.random()*20-5);
            try{
                Tablero.borrar(x);
            } catch (PersException pe){
                System.err.println(pe.getMessage()+" "+pe.pos);
            }
        }
        Tablero.mostrar();
    }
}
