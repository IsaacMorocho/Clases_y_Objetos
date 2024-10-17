public class Persona {
    String nombre;
    int edad;
    double estatura;

    public Persona(String nombre, int edad, double estatura){
        this.nombre = nombre;
        this.edad = edad;
        this.estatura = estatura;
    }
    public void mostrarPersonas(){
        System.out.println("Nombre: "+nombre);
        System.out.println("Edad: "+edad);
        System.out.println("Estatura: "+estatura);
        System.out.println("*********************");

    }
}

