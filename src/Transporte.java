public class Transporte {
    String nombre;
    int año;
    String tipo;

    public Transporte(String nombre, int año,String tipo) {
        this.nombre = nombre;
        this.año = año;
        this.tipo = tipo;
    }

    public void mostrarTransporte() {
        System.out.println("Nombre: " + this.nombre);
        System.out.println("Año: " + this.año);
        System.out.println("Medio de transporte: " + this.tipo);
        System.out.println("*********************");
    }
}