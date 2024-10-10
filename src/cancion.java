public class cancion {
    //Atributos
    String nombre;
    String artista;
    String genero;
    double duracion;
    //Metodos
    public cancion(String nombre, String artista, String genero, double duracion) {
        this.nombre = nombre;
        this.artista = artista;
        this.genero = genero;
        this.duracion = duracion;
    }
    public void mostrar() {
        System.out.println("Cancion: "+nombre);
        System.out.println("Artista: "+artista);
        System.out.println("Genero: "+genero);
        System.out.println("Duracion de la cancion "+nombre+" es: "+duracion);
    }


}
