/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.edu.itsur.pokebatalla.model;

public class Moltres extends Pokemon {
public  Moltres() {
    tipo = "FUEGO/VOLADOR";
        hp = 90;
        ataque = 100;
        defensa = 90;
        nivel = 1;
        precision = 4;
}
//Constructor alterno 1
    public Moltres (String nombre){
        this(); //constructor default
        this.nombre = nombre;
    }
    
     public void atacar(Pokemon oponente, String habilidad){
        if(habilidad.equals("ASCUAS")){
            //Logica del daño por ASCUAS
            System.out.println(this.nombre + " ESTA REALIZANDO EL ATAQUE -ASCUAS-");  
            System.out.println("");
        }else if(habilidad.equals("ONDA IGNEA")){
            //Logica del daño por ONDA IGNEA
            System.out.println(this.nombre + " ESTA REALIZANDO EL ATAQUE -ONDA IGNEA-");        
        }
        
    }
    
    
    
    
}

