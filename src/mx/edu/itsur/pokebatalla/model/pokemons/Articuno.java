/**
 *
 * @author Alan ArmandoGarcia Guzman
 */
package mx.edu.itsur.pokebatalla.model.pokemons;

import java.io.Serializable;
import mx.edu.itsur.pokebatalla.model.moves.Esquirla_Helada_FSC_Arc;
import mx.edu.itsur.pokebatalla.model.moves.Paisaje_Nevado_ESTD_Arc;
import mx.edu.itsur.pokebatalla.model.moves.Ataque_Ala_FSC_Mlts;
import mx.edu.itsur.pokebatalla.model.moves.Movimiento;

public class Articuno extends Pokemon implements Serializable {

    @Override
    public void atacar(Pokemon oponente, int ordinalMovimiento) {
        Articuno.Movimientos movimientoAUtilizar
                = Articuno.Movimientos.values()[ordinalMovimiento];
        Movimiento instanciaMovimiento;
        switch (movimientoAUtilizar) {
            case Rayo_Hielo_FSC_Arc:
                instanciaMovimiento = new Esquirla_Helada_FSC_Arc();
                break;
            case Paisaje_Nevado_ESTD_Arc:
                instanciaMovimiento = new Paisaje_Nevado_ESTD_Arc();
                break;
            case Paranormal_ESP_Arc:
                instanciaMovimiento = new Ataque_Ala_FSC_Mlts();
                break;
            //Otros movimientos aquí...
            default:
                throw new AssertionError();
        }
        instanciaMovimiento.utilizar(oponente, this);

    }

    @Override
    public Enum[] getMovimientos() {
        return Articuno.Movimientos.values();
    }

    public enum Movimientos {
        Rayo_Hielo_FSC_Arc,
        Paisaje_Nevado_ESTD_Arc,
        Paranormal_ESP_Arc
    }

    public Articuno() {
        this.tipo = "HIELO/VOLADOR";
        this.hp = 90;
        this.ataque = 85;
        this.defensa = 100;
        this.nivel = 1;
        this.precision = 4;
    }

    //Constructor alterno 1
    public Articuno(String nombre) {
        this(); //invocando al constructor default
        this.nombre = nombre;

    }

    //Instanciar el movimiento solicitado
}
