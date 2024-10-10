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
    //PARA OBTENER LAS VARIABLES
    //1) PRIMER METODO
    /*
    public void mostrar() {
        System.out.println("Cancion: "+nombre);
        System.out.println("Artista: "+artista);
        System.out.println("Genero: "+genero);
        System.out.println("Duracion de la cancion "+nombre+" es: "+duracion);
    }
    */
    //2) SEGUNDO METODO (GET):

    public String getNombre() {
        return nombre;
    }
    /*
    public String getArtista() {
        return artista;
    }
    public String getGenero() {
        return genero;
    }
    public double getDuracion() {
        return duracion;
    }
     */
    //3) TERCER METODO (SET)

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setArtista(String artista) {
        this.artista = artista;
    }
    public void setGenero(String genero) {
        this.genero = genero;
    }
    public void setDuracion(double duracion) {
        this.duracion = duracion;
    }
    public cancion(){

    }

}
