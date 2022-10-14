package mx.desasof.casas;

public class Casa {
    private String tipo;
    private int hab;
    private float costo;
    public Casa(String tipo, int hab, float costo){
        this.tipo = tipo;
        this.hab = hab;
        this.costo = costo;
    }
    public Casa(String tipo){
        this(tipo, 2, 2000000f);
    }
    public int hashCode(){
        x = (int)costo;

        return (int)x;
    }
    public boolean equals(){
        if (tipo == costo){
            return true;
        }
    return false;
    public toString(){
        return tipo+" "+hab+" "+costo;
    }
    }
}
