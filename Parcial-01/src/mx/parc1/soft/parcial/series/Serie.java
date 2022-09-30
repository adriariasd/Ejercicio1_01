package mx.parc1.soft.parcial.series;
public class Serie {
    public Serie(){
    }
    public int genNumero(int num){
        int x;
        if (num<10) {
            x = 100;
            do {
                num = (int)(Math.random()*x*10);
            } while (num<100);
            return num;
        } else {
            do {
                num = (int)(Math.random()*num*10);
            } while (num<10);
            return num;
        }
    }
    public int fiboN(int num){
        int x=1;
        int y=1;
        int r=0;
        for (int i = 1; i < num; i++) {
            r=x+y;
            x=y;
            y=r;
        }
        return x;
    }    
}
