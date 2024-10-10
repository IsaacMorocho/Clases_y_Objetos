import javax.swing.plaf.synth.SynthOptionPaneUI;

public class Main {
    public static void main (String [] args){
        System.out.println("Hola a todos");
        //Para declarar el objeto o instanciar una clase
        libro libro1= new libro("El resplandor", "Stephen King", "De bolsillo", 600);
        libro libro2= new libro("Anna Karenina","Leo Tolstoy"," J. Peder",450);
        libro libro3= new libro("Sapiens","Yuval Noah Harari","Winslade",233);
        libro libro4= new libro("Harry Potter and the Sorcerer's Stone","J.K. Rowling","Bloomsbury",384);
        libro libro5= new libro("La sombra del viento", "Carlos Ruiz Zafón", "Planeta", 490);

        libro1.imprimir();
        System.out.println(libro1.imprimircubierta());
        libro2.imprimir();
        System.out.println(libro2.imprimircubierta());
        libro3.imprimir();
        System.out.println(libro3.imprimircubierta());
        libro4.imprimir();
        System.out.println(libro4.imprimircubierta());
        libro5.imprimir();
        System.out.println(libro5.imprimircubierta());
        //Clase de las canciones
        //CON EL METODO 1:
        System.out.println("CLASE: CANCIONES");
        cancion pista1= new cancion("Close to you","Carpenters","Indie", 3.26);
        cancion pista2= new cancion("Virgen","Los adolescentes","Salsa", 3.20);
        cancion pista3 = new cancion();
        /*
        pista1.mostrar();
        pista2.mostrar();
        */
        //CON EL METODO 2:

        System.out.println(pista1.getNombre());
        /*
        System.out.println(pista1.getArtista());
        System.out.println(pista1.getGenero());
        System.out.println(pista1.getDuracion());
        System.out.println(pista2.getNombre());
        System.out.println(pista2.getArtista());
        System.out.println(pista2.getGenero());
        System.out.println(pista2.getDuracion());
        */
        //CON EL METODO 3:

        pista1.setNombre("OK"); //cambiando el valor de "nombre" con el get atraves del set
        System.out.println(pista1.getNombre());
        pista3.setNombre("RUN");
        pista3.setArtista("Kanye West");
        pista3.setGenero("Pop");
        pista3.setDuracion(3.26);

    }
}