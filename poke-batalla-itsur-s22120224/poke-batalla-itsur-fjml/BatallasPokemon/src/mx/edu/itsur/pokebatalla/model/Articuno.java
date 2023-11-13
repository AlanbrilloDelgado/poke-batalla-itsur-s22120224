package mx.edu.itsur.pokebatalla.model;

public class Articuno extends Pokemon {
public  Articuno() {
        tipo = "HIELO/VOLADOR";
        hp = 90;
        ataque = 85;
        defensa = 100;
        nivel = 1;
        precision = 4;
}
    //Constructor alterno 1
    public Articuno (String nombre){
        this(); //constructor default
        this.nombre = nombre;
    }
     public void atacar(Pokemon oponente, String habilidad){
        if(habilidad.equals("TORNADO")){
            //Logica del daño por TORNADO
            System.out.println(this.nombre + " ESTA REALIZANDO EL ATAQUE -TORNADO-");  
            System.out.println("");
        }else if(habilidad.equals("ESQUIRLA HELADA")){
            //Logica del daño por ESQUIRLA HELADA
            System.out.println(this.nombre + " ESTA REALIZANDO EL ATAQUE -ESQUIRLA HELADA-");            
        }  
    }  
}

