public class Auto {
    String modelo;
    int año;
    String color;

    public Auto(String modelo, int año,String color){
        this.modelo=modelo;
        this.año=año;
        this.color=color
    }
    public void mostrarCarros(){
        System.out.println("Modelo: "+modelo);
        System.out.println("Año del auto: "+año);
        System.out.println("Color del auto: "+color);
        System.out.println("*********************");
        
    }
}
