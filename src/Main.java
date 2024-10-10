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

        System.out.println("CLASE: CANCIONES");
        cancion pista1= new cancion("Close to you","Carpenters","Indie", 3.26);
        cancion pista2= new cancion("Virgen","Los adolescentes","Salsa", 3.20);
        pista1.mostrar();
        pista2.mostrar();
    }
}