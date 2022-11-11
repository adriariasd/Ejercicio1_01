package edu.escuela.gamepz.pruebas;
import edu.escuela.gamepz.personajes.*;
import edu.escuela.gamepz.personajes.buenos.*;
import edu.escuela.gamepz.personajes.malos.*;
import edu.escuela.gamepz.utils.*;
import static edu.escuela.gamepz.utils.Escudo.*;

import java.util.TreeSet;
public class PruebaColeccion {
    Personaje[] datos = {
        new Planta("Fabian", Tablero.genVida(), MEDIO),
        new Planta("Bianca", Tablero.genVida()),
        new Planta("Fabian", Tablero.genVida()),
        new Planta("Armando", Tablero.genVida(), BAJO),
        new Zombie("Bianca", Tablero.genVida()),
        new Planta("Dayan", Tablero.genVida()),
        new Zombie("Armando", Tablero.genVida(), false),
        new Zombie("Dayan", Tablero.genVida(), true),
        new Zombie("Armando", Tablero.genVida())
    };
    TreeSet<Personaje> ts = new TreeSet<>();
    ts.add(datos[0]);
    ts.add(datos[1]);
    ts.add(datos[2]);
    ts.add(datos[3]);
    ts.add(datos[4]);
    ts.add(datos[5]);
    ts.add(datos[6]);
    ts.add(datos[7]);
    ts.add(datos[8]);

}
