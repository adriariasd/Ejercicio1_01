package mx.com.hilos.corredores.hilos;
import javax.swing.JLabel;
import java.lang.Thread;
public class Letra implements Runnable{
    char letra;
    JLabel etq;
    public Letra(JLabel etq, char letra){
        this.letra = letra;
        this.etq = etq;
    }
    public void run(){
        String cadena = etq.getText();
        for (int i = 1; i < 51; i++) {
            cadena += String.valueOf(letra);
            etq.setText(cadena);
            int rand = (int)(Math.random()*1000);
            try {
                Thread.sleep(rand);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        cadena += "Finalizado";
        etq.setText(cadena);
    }
}
