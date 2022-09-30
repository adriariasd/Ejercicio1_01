package mx.parc1.soft.parcial.series;
public class Series {
    public void Serie(){
        
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
