package mx.gob.zacatecas.enumerados.utilerias;
public enum Memoria{
    DDR("Memoria ram",166f,30),
    DDR2("Laptop",240f,35),
    DDR3("Laptop nueva",533f,40),
    DDR4("Gamer",1600f,40);
    String tipo;
    float vel;
    int pines;
    private Memoria(String tipo, float vel, int pines){
        this.tipo=tipo;
        this.vel=vel;
        this.pines=pines;
    }
    public String getTipo() {
        return tipo;
    }
    public float getVel() {
        return vel;
    }
    public int getPines() {
        return pines;
    }
}