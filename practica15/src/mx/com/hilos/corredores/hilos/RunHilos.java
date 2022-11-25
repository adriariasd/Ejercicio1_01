package mx.com.hilos.corredores.hilos;
import javax.swing.JLabel;
import javax.swing.JTextField;
import mx.com.hilos.corredores.hilos.Letra;
public class RunHilos{
    public RunHilos(){
    }
    public static void iniciar(JTextField txt1, JTextField txt2, JLabel elem1, JLabel elem2){
        char ch1, ch2;
        String salida1, salida2;
        ch1 = (txt1 != null && txt1.getText().length() != 0)? txt1.getText().charAt(0):'E'; 
        ch2 = (txt2 != null && txt2.getText().length() != 0)? txt2.getText().charAt(0):'E'; 
        salida1 = String.valueOf(ch1);
        salida2 = String.valueOf(ch2);
        elem1.setText(salida1);
        elem2.setText(salida2);
        Letra hilo1 = new Letra(elem1, ch1);
        Letra hilo2 = new Letra(elem2, ch2);
        Thread run1 = new Thread(hilo1);
        Thread run2 = new Thread(hilo2);
        run1.start();
        run2.start();
    }
}
