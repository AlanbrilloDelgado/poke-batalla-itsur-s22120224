/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mx.edu.itsur.pokebatalla;


import mx.edu.itsur.pokebatalla.battles.Batalla;
import mx.edu.itsur.pokebatalla.battles.Entrenador;
import mx.edu.itsur.pokebatalla.model.Archivos.Filemajer;
import mx.edu.itsur.pokebatalla.model.pokemons.Articuno;
import mx.edu.itsur.pokebatalla.model.pokemons.Pikachu;
import mx.edu.itsur.pokebatalla.model.pokemons.Zapdos;
import mx.edu.itsur.pokebatalla.model.pokemons.Moltres;

/**
 *
 * @author AlanG
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Batalla batalla = Filemajer.leerPartida();
        
        if (batalla==null)
        {
        Articuno Artc1 =  new Articuno("Chucho");
        Zapdos Zpd = new Zapdos("Cris");    
        Moltres Mlts =new Moltres("Erick");
        Pikachu pik1 = new Pikachu("Pablo");
        

        Entrenador e1 = new Entrenador("Andrea");
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
