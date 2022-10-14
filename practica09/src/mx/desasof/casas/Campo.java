package mx.desasof.casas;

public class Campo extends Casa{
    float[] piscina;
    piscina = new float[2];
    public Campo(String tipo, int hab, float costo, float x, float y){
        super(tipo, hab, costo);
        piscina[0] = x;
        piscina[1] = y;
    }
    public Campo(String tipo, float x, float y){
        super(tipo);
        piscina[0] = x;
        piscina[1] = y;
    }
    public int hashCode(){
        return super.hashCode()*((int)piscina[0])*((int)piscina[1])/5;
    }
    public boolean equals(Object ob){
        return super.equals() && ob instanceof Campo; 
    }
    public String toString(){
        return super.toString()+((int)piscina[0])+((int)piscina[1]);
    }
}
