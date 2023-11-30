/**
 *
 * @author Alan ArmandoGarcia Guzman
 */
package mx.edu.itsur.pokebatalla.model.pokemons;

import java.io.Serializable;
import mx.edu.itsur.pokebatalla.model.moves.AtaqueRapido;
import mx.edu.itsur.pokebatalla.model.moves.Impactrueno;
import mx.edu.itsur.pokebatalla.model.moves.Latigo;
import mx.edu.itsur.pokebatalla.model.moves.Movimiento;

/**
 *
 * @author FJML1983
 */
public class Charmander extends Pokemon implements Serializable{

    @Override
    public void atacar(Pokemon oponente, int ordinalMovimiento) {
        Charmander.Movimientos movimientoAUtilizar
            = Charmander.Movimientos.values()[ordinalMovimiento];
        
         Movimiento instanciaMovimiento;
        switch (movimientoAUtilizar) {
            case ATAQUE_RAPIDO:
                instanciaMovimiento = new AtaqueRapido();
                break;
            
            
            default:
                throw new AssertionError();
        }
        instanciaMovimiento.utilizar(this, oponente);
    }

    @Override
    public Enum[] getMovimientos() {
         return Charmander.Movimientos.values();
    }

    public enum Movimientos {
        ATAQUE_RAPIDO

        //Otros movimientos...
    }

    public Charmander() {
        this.tipo = "FUEGO";
        this.hp = 39;
        this.ataque = 52;
        this.defensa = 43;
        this.nivel = 1;
        this.precision = 4;
    }

    //Constructor alterno 1
    public Charmander(String nombre) {
        this(); //invocando al constructor default
        this.nombre = nombre;
    }

    
}
