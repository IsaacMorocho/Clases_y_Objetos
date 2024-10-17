public class Materia {
    String nombre;
    String codigo;
    int horas;
    public Materia(String nombre, String codigo, int horas) {
        this.nombre = nombre;
        this.codigo = codigo;
        this.horas = horas;
    }
    public void mostrar() {
        System.out.println("Nombre de la materia: " + this.nombre);
        System.out.println("Codigo Materia: " + this.codigo);
        System.out.println("Horas: " + this.horas);
        System.out.println("********************");
    }
}
