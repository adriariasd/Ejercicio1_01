package edu.escuela.gamepz.pruebas;
import java.util.Random;

import edu.escuela.gamepz.personajes.*;
import edu.escuela.gamepz.personajes.buenos.*;
import edu.escuela.gamepz.personajes.malos.*;
public class PruebaHerencia {
    public static void main(String[] args) {
        int x;
        int cont = 0;
        Personaje per01 = new Personaje("David", 100);
        Personaje per02 = new Personaje("Bianca");
        Planta plan01 = new Planta("Fabian", 10, 'B');
        Planta plan02 = new Planta("Almendra", 50);
        Planta plan03 = new Planta("Ricardo", 'C');
        Planta plan04 = new Planta("Silvia");
        Zombie zom01 = new Zombie("Armando", 80, false);
        Zombie zom02 = new Zombie("Josseline", true);
        Zombie zom03 = new Zombie("Eduardo");
        Personaje[] personajes = {
            per01, per02, plan01, plan02, plan03, plan04, zom01, zom02, zom03};
        for (Personaje tmp : personajes) {
            cont+=1;
            System.out.println(tmp.getDetalle());
            x = (int)(Math.random()*100);
            if (tmp instanceof Planta) {
                Planta p = (Planta) tmp;
                System.out.println("Soy planta "+p.getEscudo());
                tmp.addVida(x);
            }
            if (tmp instanceof Zombie){
                Zombie z = (Zombie) tmp;
                System.out.println("Soy zombie "+z.getAtaque());
                tmp.decVida(x);
            }
            System.out.println(x);
            System.out.println(tmp.getDetalle());
            System.out.println("***** OBJETO "+cont+"*****");
        }
    }
}
