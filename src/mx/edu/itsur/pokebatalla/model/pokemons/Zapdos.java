/**
 *
 * @author Alan Armando Garcia Guzman
 */
package mx.edu.itsur.pokebatalla.model.pokemons;

import java.io.Serializable;
import mx.edu.itsur.pokebatalla.model.moves.Movimiento;
import mx.edu.itsur.pokebatalla.model.moves.Trueno_ESP_Zpds;
import mx.edu.itsur.pokebatalla.model.moves.Pico_Taladro_FSC_Zpds;
import mx.edu.itsur.pokebatalla.model.moves.Onda_Trueno_ESTD_Zpds;
public class Zapdos extends Pokemon implements Serializable{

    public void atacar(Moltres Mlts, Movimientos movimientos) {
    }

    @Override
    public void atacar(Pokemon oponente, int ordinalMovimiento) {
        
         Zapdos.Movimientos movimientoAUtilizar
            = Zapdos.Movimientos.values()[ordinalMovimiento];
         
         Movimiento instanciaMovimiento; 
        switch (movimientoAUtilizar)
        {
            case Trueno_ESP_Zpds: 
                instanciaMovimiento = new Trueno_ESP_Zpds();
                break;
            case Onda_Trueno_ESTD_Zpds:
                instanciaMovimiento = new Onda_Trueno_ESTD_Zpds();
                break;
            case Pico_Taladro_FSC_Zpds:
                instanciaMovimiento = new Pico_Taladro_FSC_Zpds();
                break;
            default: 
                throw new AssertionError();
        }
        instanciaMovimiento.utilizar(this, oponente);
    }

    @Override
    public Enum[] getMovimientos() {
        return Zapdos.Movimientos.values();
    }
    public enum Movimientos {
        Trueno_ESP_Zpds,
        Pico_Taladro_FSC_Zpds,
        Onda_Trueno_ESTD_Zpds,
        
    }

    public Zapdos() {
        this.tipo = "ELECTRICO/VOLADOR";
        this.hp = 90;
        this.ataque = 90;
        this.defensa = 85;
        this.nivel = 1;
        this.precision = 4;
    }

    //Constructor alterno 1
    public Zapdos(String nombre) {
        this(); //invocando al constructor default
        this.nombre = nombre;

    }
}