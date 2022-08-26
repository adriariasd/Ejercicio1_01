public class PruebaPersonaje {
    public static void main(String[] args) {
        Personaje alumno = new Personaje();
        alumno.setNombre("KobeBryant");
        alumno.saludar();
        System.out.println("Modificando el nombre" + alumno.getNombre());
        alumno.setNombre("Michael Jordan");
        alumno.saludar();
        
    }
}
