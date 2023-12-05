/**
 *
 * @author Alan Armando Garcia Guzman
 */
package mx.edu.itsur.pokebatalla.model.moves;

public class AtaqueRapido extends MovimientoFisico{

    public AtaqueRapido() {
        this.tipo=TiposDeMovimiento.NORMAL;
        this.potencia = 40;
        this.precision = 100;
        this.puntosPoder = 30;
    }
    
}
