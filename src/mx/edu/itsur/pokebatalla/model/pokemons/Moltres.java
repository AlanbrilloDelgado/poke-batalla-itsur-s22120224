/**
 *
 * @author Alan Armando Garcia Guzman
 */
package mx.edu.itsur.pokebatalla.model.pokemons;

import java.io.Serializable;
import mx.edu.itsur.pokebatalla.model.moves.Movimiento;
import mx.edu.itsur.pokebatalla.model.moves.Ascuas_ESP_Mlts;
import mx.edu.itsur.pokebatalla.model.moves.Dia_Soleado_ESTD_Mlts;
import mx.edu.itsur.pokebatalla.model.moves.Ataque_Ala_FSC_Mlts;
public class Moltres extends Pokemon implements Serializable{

    @Override
    public void atacar(Pokemon oponente, int ordinalMovimiento) {
         Moltres.Movimientos movimientoAUtilizar
            = Moltres.Movimientos.values()[ordinalMovimiento];
         
         Movimiento instanciaMovimiento; 
         switch (movimientoAUtilizar) 
         {
            case Ascuas_ESP_Mlts:
                instanciaMovimiento = new Ascuas_ESP_Mlts();
                break;
            case Dia_Soleado_ESTD_Mlts:
                instanciaMovimiento = new Dia_Soleado_ESTD_Mlts();
                break;
            case Ataque_Ala_FSC_Mlts:
                instanciaMovimiento = new Ataque_Ala_FSC_Mlts();
            default:
                throw new AssertionError();
        }
        instanciaMovimiento.utilizar(this, oponente);
    }

    @Override
    public Enum[] getMovimientos() {
        return Moltres.Movimientos.values();
    }
    

    public enum Movimientos {

        Ascuas_ESP_Mlts,
        Dia_Soleado_ESTD_Mlts,
        Ataque_Ala_FSC_Mlts,
    }

    public Moltres() {
        this.tipo = "FUEGO/VOLADOR";
        this.hp = 90;
        this.ataque = 100;
        this.defensa = 90;
        this.nivel = 1;
        this.precision = 4;
    }

    //Constructor alterno 1
    public Moltres(String nombre) {
        this(); //invocando al constructor default
        this.nombre = nombre;

    } 
}
     
