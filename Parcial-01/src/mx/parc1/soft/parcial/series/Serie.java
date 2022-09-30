package mx.parc1.soft.parcial.series;
public class Serie {
    private int x=1;
    private int y=1;
    private int r;
    int a[] = {x,y,r};
    public Serie(){
        for (int i = 0; i < 1000000; i++) {
            
        }
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
