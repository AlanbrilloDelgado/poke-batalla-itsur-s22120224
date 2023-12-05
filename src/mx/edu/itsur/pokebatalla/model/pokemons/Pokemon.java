/**
 *
 * @author Alan Armando Garcia Guzman
 */
package mx.edu.itsur.pokebatalla.model.pokemons;

import java.io.Serializable;
import java.util.List;
import mx.edu.itsur.pokebatalla.model.moves.Movimiento;

public abstract class Pokemon implements Serializable{

    //Atributos
    protected String tipo;
    protected String nombre;
    protected int nivel;
    protected int hp;
    protected int ataque;
    protected int defensa;
    protected double precision;

    Pokemon() {

        }

        public int getNivel() {
            return nivel;
        }

        public int gethp()
        {
            return hp;
        }

        public int getAtaque() {
            return ataque;
        }

        public int getDefensa() {
            return defensa;
        }

        public void setNombre(String nombre) {
            this.nombre = nombre;
        }

        public void recibirDanio(int danio) {
            this.hp = this.hp - danio;
            if (this.hp <= 0) {
                System.out.println(this.getClass().getSimpleName() + " YA NO PUEDE CONTINUAR");
            }
        }
        
        

   
        public abstract void atacar(Pokemon oponente, int ordinalMovimiento);

        public abstract Enum[] getMovimientos();

        @Override
        public String toString() {
            if (hp < 0) {
                return this.getClass().getSimpleName() + "{tipo:" + tipo + " hp:" + "0" + "}";
            } else {

                return this.getClass().getSimpleName() + "{tipo:" + tipo + " hp:" + hp + "}";
            }
        }

    }