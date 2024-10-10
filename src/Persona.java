public class Persona {
    String nombre;
    int edad;
    double estatura;
    double peso;

    public Persona(String nombre, int edad, double estatura, double peso) {
        this.nombre = nombre;
        this.edad = edad;
        this.estatura = estatura;
        this.peso = peso;
    }

    public String getNombre() {
        return nombre;
    }
    public int getEdad() {
        return edad;
    }
    public double getEstatura() {
        return estatura;
    }
    public double getPeso() {
        return peso;
    }
}

