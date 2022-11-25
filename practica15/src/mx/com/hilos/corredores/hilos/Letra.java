package mx.com.hilos.corredores.hilos;

import javax.swing.JLabel;

public class Letra {
    char letra;
    JLabel etq;
    public Letra(JLabel etq, char letra){
        String cadena = etq.getText();
        for (int i = 1; i < 51; i++) {
            cadena += String.valueOf(letra);
        }
    }
}
