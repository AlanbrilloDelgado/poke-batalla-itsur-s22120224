/**
 *
 * @author Alan Armando Garcia Guzman
 */
package mx.edu.itsur.pokebatalla.model;

import java.io.Serializable;

public class Bullbasaur extends Pokemon implements Serializable {

    public Bullbasaur() {
        tipo = "PLANTA/VENENO";
        hp = 45;
        ataque = 49;
        defensa = 49;
        nivel = 1;
        precision = 4;
    }

    //Constructor alterno 1
    public Bullbasaur(String nombre){
        this(); //invocando al constructor default
        this.nombre = nombre;
    }
    
    
    
}
