package mx.edu.itsur.pokebatalla.model;

public class Zapdos extends Pokemon {
 public Zapdos() {
        tipo = "ELECTRICO/VOLADOR";
        hp = 90;
        ataque = 90;
        defensa = 85;
        nivel = 1;
        precision = 4;
    }
    //Constructor alterno 1
    public Zapdos (String nombre){
        this(); //constructor default
        this.nombre = nombre;
    }
     public void atacar(Pokemon oponente, String habilidad){
        if(habilidad.equals("PICOTAZO")){
            //Logica del daño por PICOTAZO
            System.out.println(this.nombre + " ESTA REALIZANDO EL ATAQUE -PICOTAZO-");  
            System.out.println("");
        }else if(habilidad.equals("CARGA")){
            //Logica del daño por CARGA
            System.out.println(this.nombre + " ESTA REALIZANDO EL ATAQUE -CARGA-");        
        }
    }  
}


