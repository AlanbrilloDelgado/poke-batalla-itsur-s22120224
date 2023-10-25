/**
 *
 * @author LMC Alumno
 */
package mx.edu.itsur.pokebatalla.model.pokemons;

import mx.edu.itsur.pokebatalla.model.moves.Esquirla_Helada_FSC_Arc;
import mx.edu.itsur.pokebatalla.model.moves.Paisaje_Nevado_ESTD_Arc;
import mx.edu.itsur.pokebatalla.model.moves.Ataque_Ala_FSC_Mlts;
import mx.edu.itsur.pokebatalla.model.moves.Movimiento;
public class Articuno extends Pokemon {

    public enum Movimientos {
        Rayo_Hielo_FSC_Arc,
        Paisaje_Nevado_ESTD_Arc,
        Paranormal_ESP_Arc
    }

    public Articuno() {
        tipo = "HIELO/VOLADOR";
        hp = 90;
        ataque = 85;
        defensa = 100;
        nivel = 1;
        precision = 4;
    }

    //Constructor alterno 1
    public Articuno(String nombre) {
        this(); //invocando al constructor default
        this.nombre = nombre;

    }
     public void atacar(Pokemon oponente, Articuno.Movimientos movimientoAUtilizar) {

        //Instanciar el movimiento solicitado
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
            //Otros movimientos aquí...
            default:
                throw new AssertionError();
        }
     }
}