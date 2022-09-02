public class Personaje{
    private String nombre;
    private int edad;
    public Personaje(String n){
        edad=0;
        nombre=n;
    }
    public void setNombre(String n){
        this.nombre = n;
    }
    public String getNombre(){
        return nombre;
    }
    public void saludar(){
        System.out.println("Hola Alumno de POO " + nombre);
    }
    public int getEdad(){
        return edad;
    }
    public boolean setEdad(int edad){
        if (edad>0) {
            if (edad<120) {
                this.edad=edad;
                return true;
            } else{
                return false;
            }
        } else{
            return false;
        }
    }

}
