package mx.desasof.casas;

public class Campo extends Casa{
    float[] piscina;
    piscina = new float[2];
    public Casa(String tipo, int hab, float costo, float x, float y){
        super(tipo, hab, costo);

    }
    public int hashCode(){
        return super.hashCode()*x*y/5;
    }
    public boolean equals(Object ob){
        return super.equals() && ob instanceof Campo; 
    }
}
