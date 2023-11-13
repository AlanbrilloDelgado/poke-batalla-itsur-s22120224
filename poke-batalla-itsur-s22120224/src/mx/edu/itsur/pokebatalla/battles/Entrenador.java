/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.edu.itsur.pokebatalla.battles;
import java.util.ArrayList;
import java.util.List;
import mx.edu.itsur.pokebatalla.model.pokemons.Pokemon;

/**
 *
 * @author AlanG
 */
public class Entrenador {
    //Atributos
    protected String nombre;
    protected List<Pokemon> pokemonsCapturados;
    protected Pokemon pokemonActual;
    
    public Entrenador(String nombre){
        this.nombre = nombre;
        this.pokemonsCapturados = new ArrayList<>();
        this.pokemonsCapturados = new ArrayList<>();
    }
    public boolean capturarPokemon(Pokemon p){
        return pokemonsCapturados.add(pika);
    }
    
    //Metodos
    public void instruirMovimientoAlPokemonActual(Pokemon oponente, int ordinalMovimiento){
        if (pokemonActual == null){
            System.out.println("No hay ningun Pokemon que se haya seleccionado");
            return;
        }
        if(ordinalMovimiento < 0 || ordinalMovimiento >= pokemonActual.getMovimientos().lenght){
            System.out.println("El ordinal de movimiento  no es valido");
            return;
        }
        this.pokemonActual.atacar(oponente, ordinalMovimiento);
    }
        public boolean Derrotado(){
            for(Pokemon pokemon : pokemonsCapturados){
                if(pokemon.geth() > 0){
                    return false;
                }
            }
            return true;
        }
        public String getNombre(){
            return nombre;
        }
        public Pokemon getPokemonActual(){
            return pokemonActual(); 
        }
        public void setPokemonActual(Pokemon p){
            this.pokemonActual = p;
        }
        public List<Pokemon> getPokemonsCapturados(){
            return pokemonsCapturados;
        }
}