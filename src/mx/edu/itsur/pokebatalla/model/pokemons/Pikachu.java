/**
 *
 * @author Alan Armando Garcia Guzman
 */
package mx.edu.itsur.pokebatalla.model.pokemons;

import java.io.Serializable;
import java.util.ArrayList;
import mx.edu.itsur.pokebatalla.model.moves.AtaqueRapido;
import mx.edu.itsur.pokebatalla.model.moves.Impactrueno;
import mx.edu.itsur.pokebatalla.model.moves.Latigo;
import mx.edu.itsur.pokebatalla.model.moves.Movimiento;

/**
 *
 * @author FJML1983
 */
public class Pikachu extends Pokemon implements Serializable {

    @Override
    public void atacar(Pokemon oponente, int ordinalMovimiento) {
        Pikachu.Movimientos movimientoAUtilizar
                = Pikachu.Movimientos.values()[ordinalMovimiento];
        Movimiento instanciaMovimiento;        
        switch (movimientoAUtilizar) {
            case IMPACTRUENO:
                instanciaMovimiento = new Impactrueno();
                break;
            case ATAQUE_RAPIDO:
                instanciaMovimiento = new AtaqueRapido();
                break;
            case LATIGO:
                instanciaMovimiento = new Latigo();
                break;
        
            default:
                throw new AssertionError();
        }
    }

    @Override
    public Enum[] getMovimientos() {
        return Articuno.Movimientos.values();
    }

    /**
     * Movimientos que puede realizar el Pokémon
     */
    public enum Movimientos {
        IMPACTRUENO,
        ATAQUE_RAPIDO,
        LATIGO

        //Otros movimientos...
    }

    //Constructor default
    public Pikachu() {
        this.tipo = "ELECTRICO";
        this.hp = 35;
        this.ataque = 55;
        this.defensa = 30;
        this.nivel = 1;
        this.precision = 4;
    }

    //Constructor alterno 1
    public Pikachu(String nombre) {
        this(); //invocando al constructor default
        this.nombre = nombre;
    }
}
        
    


