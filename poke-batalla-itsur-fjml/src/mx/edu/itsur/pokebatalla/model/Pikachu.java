/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.edu.itsur.pokebatalla.model;
import java.util.ArrayList;
import mx.edu.itsur.pokebatalla.model.Pokemon;

public class Pikachu  extends Pokemon{

    //Constructor default
    public Pikachu() {
        this.tipo = "ELECTRICO";
        this.hp = 35;
        this.ataque = 55;
        this.defensa = 30;
        this.nivel = 1;
        this.precision = 4;
        this.habilidades = new ArrayList<>();
        this.habilidades.add("ATACKTRUENO");
        this.habilidades.add("BOLAVOLTIO");
        //....
    }    
    //Constructor alterno 1
    public Pikachu(String nombre){
        this(); //invocando al constructor default
        this.nombre = nombre;
    }
    public void atacar(Pokemon oponente, String habilidad){
        if(habilidad.equals("ATACKTRUENO")){
            //Logica del daño por atacktrueno
            System.out.println(" ESTA REALIZANDO EL ATAQUE -ATACKTRUENO-");
            System.out.println("");
        }else if(habilidad.equals("BOLAVOLTIO")){
            //Logica del daño por BOLAVOLTIO
            System.out.println(" ESTA REALIZANDO EL ATAQUE -BOLAVOLTIO-");            
        }
        //TODO: otras habilidades...
    }
   
}
