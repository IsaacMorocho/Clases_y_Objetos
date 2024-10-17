import javax.swing.plaf.synth.SynthOptionPaneUI;

public class Main {
    public static void main (String [] args){
        System.out.println("Hola a todos");
        //Para declarar el objeto o instanciar una clase
        //CLASE LIBRO
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
        //CLASE CANCIONES 
        //CON EL METODO 1:
        System.out.println("CLASE: CANCIONES");
        cancion pista1= new cancion("Close to you","Carpenters","Indie", 3.26);
        cancion pista2= new cancion("Virgen","Los adolescentes","Salsa", 3.20);
        cancion pista3 = new cancion();
        
        pista1.mostrar();
        pista2.mostrar();
        
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

        //CLASE MATERIA
        Materia mat1= new Materia("Ecologia", "DS24B", 2);
        Materia mat2= new Materia("Redes", "DS24B", 4);

        System.out.println("**MATERIAS**");
        mat1.mostrar();
        mat2.mostrar();

        //CLASE AUTO
        Auto carro1= new Auto("Nissan",2019,"Gris");
        Auto carro2= new Auto("Kia",2022,"Rojo");

        carro1.mostrarCarros();
        carro2.mostrarCarros();
        
        //CLASE PERSONA
        Persona per1=new Persona("Ariel",23,80.4);
        Persona per2=new Persona("Javier",19,72.8);

        per1.mostrarPersonas();
        per2.mostrarPersonas();

        //CLASE TRANSPORTE
        Transporte transp1=new Transporte("Bus",2004,"Terrestre");
        Transporte transp2=new Transporte("Avion",2001,"Aereo");

        transp1.mostrarTransporte();
        transp2.mostrarTransporte();
        
        
    }
}