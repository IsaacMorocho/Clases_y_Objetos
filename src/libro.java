public class libro {
    //Atributos

    String titulo;
    String autor;
    String editorial;
    int paginas;

    //Metodos
        //Metodo obligatorio:
    public libro(String titulo, String autor, String editorial, int paginas) {
        this.titulo = titulo;
        this.autor = autor;
        this.editorial = editorial;
        this.paginas = paginas;
    }
    public void imprimir(){
        System.out.println("El titulo es: "+this.titulo);
        System.out.println("El autor es: "+this.autor);
        System.out.println("La editorial es: "+this.editorial);
        System.out.println("El nº de paginas es: "+this.paginas);
        System.out.println("*****************************");

    }

    public int imprimircubierta() {
        return this.paginas+5;
    }
}

