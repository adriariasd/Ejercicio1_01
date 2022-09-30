package mx.parc1.soft.parcial.series;
public class Serie {
    public Serie(){
        int num;
        int x=1;
        int y=1;
        int r;
        int a[];
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
        int x=1;
        int y=1;
        int r;
        for (int i = 0; i < num; i++) {
            
        }
        return num;
    }    
}
