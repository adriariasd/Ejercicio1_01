package mx.desasof.pruebas;
import mx.desasof.casas.*;
public class PruebaCasa {
    public static void main(String[] args) {
        Casa[] casas = {
            new Casa("Estandar",3,3000000),
            new Campo("Cazador",3.5f,10f),
            new Urbana("Residencia", 3, 2500000,2),
            new Casa("Estandar",3,3000000),
            new Campo("Cazador", 3.5f, 10),
            new Urbana("Residencia",3, 2500000, 2),
            new Casa("Estandar"),
            new Campo("Cazador",4,15000,3f,5f),
            new Urbana("Residencia", 5),
        };
    int i = 0;
    while (i<casas.length){
        for (Casa c : casas) {
            System.out.println(c);
        }
        i++;
    }
    }
}
