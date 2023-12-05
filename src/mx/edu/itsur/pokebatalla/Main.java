/**
 *
 * @author Alan Armando Garcia Guzman
 */
package mx.edu.itsur.pokebatalla;


import mx.edu.itsur.pokebatalla.battles.Batalla;
import mx.edu.itsur.pokebatalla.battles.Entrenador;
import mx.edu.itsur.pokebatalla.model.Archivos.Filemager;
import mx.edu.itsur.pokebatalla.model.pokemons.Articuno;
import mx.edu.itsur.pokebatalla.model.pokemons.Pikachu;
import mx.edu.itsur.pokebatalla.model.pokemons.Zapdos;
import mx.edu.itsur.pokebatalla.model.pokemons.Moltres;

public class Main {

    public static void main(String[] args) {
        
        Batalla batalla = Filemager.leerPartida();
        
        if (batalla==null)
        {
        Articuno Artc1 =  new Articuno("Chucho");
        Zapdos Zpd = new Zapdos("Cris");    
        Moltres Mlts =new Moltres("Erick");
        Pikachu pik1 = new Pikachu("Pablo");
        

        Entrenador e1 = new Entrenador("Solovino");
        e1.capturarPokemon(Artc1);
        e1.capturarPokemon(Zpd);

       Entrenador e2 = new Entrenador("Alan");
        
        e2.capturarPokemon(Mlts);
        e2.capturarPokemon(pik1);
        
        batalla = new Batalla(e1, e2);
        }
        batalla.desarrollarBatalla();
    }
    
}
