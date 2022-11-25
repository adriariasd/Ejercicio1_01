package mx.com.hilos.corredores.hilos;
import javax.swing.JLabel;
import javax.swing.JTextField;
public class RunHilos {
    public RunHilos(){

    }
    public static void iniciar(JTextField txt1, JTextField txt2, JLabel elem1, JLabel elem2){
        char ch1, ch2;
        String salida1, salida2;
        if(txt1.getText().length() != 0){
            ch1 = txt1.getText().charAt(0);
        } else{
            ch1 = 'E';
        }
        if(txt2.getText().length() != 0){
            ch2 = txt2.getText().charAt(0);
        } else{
            ch2 = 'M';
        }
        salida1 = String.valueOf(ch1);
        salida2 = String.valueOf(ch2);
    }
}
