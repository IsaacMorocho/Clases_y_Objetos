public class Pelicula {
    String titulo;
    int añoEstreno;
    String genero;

    public Pelicula(String titulo, int añoEstreno,String genero) {
        this.titulo = titulo;
        this.añoEstreno = añoEstreno;
        this.genero = genero;

    }

    public void mostrarPeliculas() {
        System.out.println("Titulo: " + this.titulo);
        System.out.println("Año de estreno: " + this.añoEstreno);
        System.out.println("Genero: " + this.genero);
        System.out.println("*********************");
    }
}
