
package mx.edu.itsur.pokebatalla.model.pokemons;

import mx.edu.itsur.pokebatalla.model.moves.Movimiento;
import mx.edu.itsur.pokebatalla.model.moves.Trueno_ESP_Zpds;
import mx.edu.itsur.pokebatalla.model.moves.Pico_Taladro_FSC_Zpds;
import mx.edu.itsur.pokebatalla.model.moves.Onda_Trueno_ESTD_Zpds;
public class Zapdos extends Pokemon {

    public void atacar(Moltres Mlts, Movimientos movimientos) {
    }

    @Override
    public void atacar(Pokemon oponente, int ordinalMovimiento) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Enum[] getMovimientos() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    public enum Movimientos {
        Trueno_ESP_Zpds,
        Pico_Taladro_FSC_Zpds,
        Onda_Trueno_ESTD_Zpds,
        
    }

    public Zapdos() {
        tipo = "ELECTRICO/VOLADOR";
        hp = 90;
        ataque = 90;
        defensa = 85;
        nivel = 1;
        precision = 4;
    }

    //Constructor alterno 1
    public Zapdos(String nombre) {
        this(); //invocando al constructor default
        this.nombre = nombre;

    }
    
    public void atacar(Pokemon oponente, Zapdos.Movimientos movimientoautilizar)
    {
        Movimiento instanciaMovimiento; 
        
        switch (movimientoautilizar)
        {
            case Trueno_ESP_Zpds: 
                instanciaMovimiento = new Trueno_ESP_Zpds();
                break;
            default: 
                throw new AssertionError();
        }
        instanciaMovimiento.utilizar(this, oponente);
    }

}