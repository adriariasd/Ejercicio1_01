package edu.escuela.gamepz.pruebas;
import edu.escuela.gamepz.personajes.*;
import edu.escuela.gamepz.personajes.buenos.*;
import edu.escuela.gamepz.personajes.malos.*;
import edu.escuela.gamepz.utils.*;
import static edu.escuela.gamepz.utils.Escudo.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.TreeSet;
import java.util.Scanner;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Collection;
public class PruebaColeccion {
    public static void main(String[] args) {
        String path = System.getProperty("user.home") + System.getProperty("file.separator");
        Scanner s = new Scanner(System.in);
        String fname = s.nextLine();
        path += fname;
        File f = new File(path);
        if(f.exists() && f.isFile()){
            System.out.println("Archivo existe");
            System.exit(0);
        } 
        if(f.exists() && f.isDirectory()){
            System.out.println("Directorio existe");
            mostrarDirectorio(f);
            System.exit(0);
        }
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
        TreeSet<Personaje> arbol = new TreeSet<>();
        LinkedList<Personaje> lista = new LinkedList<>();
        for(Personaje per : datos){
            arbol.add(per);
            lista.add(per);
        }
        System.out.println("----Orden natural----");
        for (Personaje p : arbol) {
            System.out.println(p);
        }
        System.out.println("----Orden vida----");
        Collections.sort(lista, new ByVida());
        for (Personaje p : lista) {
            System.out.println(p);
        }
        ArrayList<Personaje> arr = new ArrayList<>();
        arr.addAll(lista);
        System.out.println("----Orden tamanio----");
        Collections.sort(arr, new BySize());
        for (Personaje p : arr) {
            System.out.println(p);
        }
        guardarObjetos(arbol);
    }
    private static void mostrarDirectorio(File f){
        for (String e : f.list()) {
            System.out.println(e);
        }
    }
    private static void guardarObjetos(TreeSet<Personaje> c){
        try{
            FileOutputStream f = new FileOutputStream("datArbol.ser");
            ObjectOutputStream s = new ObjectOutputStream (f);
            for (Object o : c) {
                s.writeObject (o);
            }
            s.close();
        } catch(IOException e){
            e.printStackTrace ();
        }
    }
}