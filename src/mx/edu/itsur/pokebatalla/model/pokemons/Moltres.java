/**
 *
 * @author LMC Alumno
 */
package mx.edu.itsur.pokebatalla.model.pokemons;




import mx.edu.itsur.pokebatalla.model.moves.Movimiento;
import mx.edu.itsur.pokebatalla.model.moves.Ascuas_ESP_Mlts;
import mx.edu.itsur.pokebatalla.model.moves.Dia_Soleado_ESTD_Mlts;
import mx.edu.itsur.pokebatalla.model.moves.Ataque_Ala_FSC_Mlts;
public class Moltres extends Pokemon {

    @Override
    public void atacar(Pokemon oponente, int ordinalMovimiento) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Enum[] getMovimientos() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public enum Movimientos {

        Ascuas_ESP_Mlts,
        Dia_Soleado_ESTD_Mlts,
        Ataque_Ala_FSC_Mlts,
    }

    public Moltres() {
        tipo = "FUEGO/VOLADOR";
        hp = 90;
        ataque = 100;
        defensa = 90;
        nivel = 1;
        precision = 4;
    }

    //Constructor alterno 1
    public Moltres(String nombre) {
        this(); //invocando al constructor default
        this.nombre = nombre;

    }
    public void atacar(Pokemon oponente, Moltres.Movimientos movimientoautilizar)
    {
        Movimiento instanciaMovimiento; 
        
         switch (movimientoautilizar) 
         {
            case Ascuas_ESP_Mlts:
                instanciaMovimiento = new Ascuas_ESP_Mlts();
                break;
            case Dia_Soleado_ESTD_Mlts:
                instanciaMovimiento = new Dia_Soleado_ESTD_Mlts();
                break;
            case Ataque_Ala_FSC_Mlts:
                instanciaMovimiento = new Ataque_Ala_FSC_Mlts();
            //Otros movimientos aquí...
            default:
                throw new AssertionError();
        }
        instanciaMovimiento.utilizar(this, oponente);
    }

}
     
