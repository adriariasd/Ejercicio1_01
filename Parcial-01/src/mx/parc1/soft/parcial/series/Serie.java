package mx.parc1.soft.parcial.series;
public class Serie {
    int i[];
    int x = 1;
    int y = 1;
    public Serie(){
        
    }
    public int genNumero(int num){
        int x;
        if (num<10) {
            x = 100;
            num = (int)(Math.random()*x*10);
            return num;
        } else {
            num = (int)(Math.random()*num*10);
            return num;
        }
    }
    public int fiboN(int num){
        return num;
    }    
}
