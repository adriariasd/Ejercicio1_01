package mx.com.hilos.corredores.hilos;
import javax.swing.JLabel;
import javax.swing.JTextField;
public class RunHilos {
    public RunHilos(){

    }
    public static void iniciar(JTextField txt1, JTextField txt2, JLabel elem1, JLabel elem2){
        char ch1, ch2;
        String salida1, salida2;
        if(txt1.getText().len != 0){
            ch1 = txt1.getText().charAt(0);
        } else{
            ch1 = 'E';
        }
        if(txt2.getText().len != 0){
            ch2 = txt2.getText().charAt(0);
        } else{
            ch2 = 'M';
        }
    }
}
