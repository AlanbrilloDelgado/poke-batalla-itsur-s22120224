/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.edu.itsur.pokebatalla.model.pokemons;

import java.io.Serializable;
import mx.edu.itsur.pokebatalla.model.moves.AtaqueRapido;
import mx.edu.itsur.pokebatalla.model.moves.Latigo;
import mx.edu.itsur.pokebatalla.model.moves.Movimiento;

/**
 *
 * @author Alan ArmandoGarcia Guzman
 */
public class Bullbasaur extends Pokemon implements Serializable{

    @Override
    public void atacar(Pokemon oponente, int ordinalMovimiento) {
        Bullbasaur.Movimientos movimientoAUtilizar
            = Bullbasaur.Movimientos.values()[ordinalMovimiento];

 Movimiento instanciaMovimiento;
        switch (movimientoAUtilizar) {
            case ATAQUE_RAPIDO:
                instanciaMovimiento = new AtaqueRapido();
                break;
            case LATIGO:
                instanciaMovimiento = new Latigo();
                break;

            //Otros movimientos aquí...
            default:
                throw new AssertionError();
}
    }

    @Override
    public Enum[] getMovimientos() {
        return Bullbasaur.Movimientos.values();
    }

    public enum Movimientos {
        ATAQUE_RAPIDO,
        LATIGO
    }

    public Bullbasaur() {
        tipo = "PLANTA/VENENO";
        hp = 45;
        ataque = 49;
        defensa = 49;
        nivel = 1;
        precision = 4;
    }

    //Constructor alterno 1
    public Bullbasaur(String nombre) {
        this(); //invocando al constructor default
        this.nombre = nombre;

    }
     

}
