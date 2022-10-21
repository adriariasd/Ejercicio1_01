package mx.gob.zacatecas.enumerados.utilerias;
public enum Tipo {
    SERVER("Servidor"),
    WORK_STATION("Estacion de trabajo"),
    DESKTOP("Escritorio"),
    LAPTOP("Portatil");   
    String type;
    private Tipo(String type){
        this.type=type;
    }
    public String getType() {
        return type;
    }
}
