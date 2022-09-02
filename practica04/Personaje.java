//inicio 8:37
public class Personaje {
    private String nombre;
    private int edad;
    public static void main(String[] args) {
        
    }
    public void setNombre(String n){
        this.nombre = n;
    }
    public String getNombre(){
        return nombre;
    }
    public void saludar(){
        System.out.println("Hola Alumno de POO" + nombre);
    }
}
