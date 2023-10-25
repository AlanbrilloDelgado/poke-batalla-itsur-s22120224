/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mx.edu.itsur.pokebatalla;


import mx.edu.itsur.pokebatalla.model.pokemons.Bullbasaur;
import mx.edu.itsur.pokebatalla.model.pokemons.Articuno;
import mx.edu.itsur.pokebatalla.model.pokemons.Zapdos;
import mx.edu.itsur.pokebatalla.model.pokemons.Moltres;
import mx.edu.itsur.pokebatalla.model.pokemons.Bullbasaur;
import mx.edu.itsur.pokebatalla.model.pokemons.Pikachu;
import mx.edu.itsur.pokebatalla.model.pokemons.Charmander;

/**
 *
 * @author FJML1983
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Hello PokeBatalla!");
        
        Pikachu pika = new Pikachu();
        Charmander charm = new Charmander();
        Bullbasaur bullb = new Bullbasaur();
        Articuno Artc1 =  new Articuno();
        Zapdos Zpd = new Zapdos();    
        Moltres Mlts =new Moltres();
        
        System.out.println("->Pikachu se encuentra con un Charmander y ataca");
        pika.atacar(charm, Pikachu.Movimientos.IMPACTRUENO);
        
    //Articuno  vs Pika
        System.out.println("Articuno: Hola Moltres");
        System.out.println("Moltres:  Hola Articuno oye una pregunta");
        System.out.println("Articuno: Si,dime");
        System.out.println("Moltres:  Tu te comiste mi gansito?");
        System.out.println("Articuno: ...");
        System.out.println("Moltres:  Responde");
        System.out.println("Articuno: Si asi fue");
        System.out.println("Moltres: :0");
        System.out.println("Moltres: M e las vas a pagar");
        System.out.println("-------------------------");
        System.out.println("INICIANDO BATALLA");
        System.out.println("-------------------------");
        
        Mlts.atacar(Artc1, Moltres.Movimientos.Ataque_Ala_FSC_Mlts);
        Artc1.atacar(Mlts, Articuno.Movimientos.Rayo_Hielo_FSC_Arc);
        Mlts.atacar(Artc1, Moltres.Movimientos.Ascuas_ESP_Mlts);
        Artc1.atacar(Mlts, Articuno.Movimientos.Paisaje_Nevado_ESTD_Arc);
        Mlts.atacar(Artc1, Moltres.Movimientos.Dia_Soleado_ESTD_Mlts);
        Artc1.atacar(Mlts, Articuno.Movimientos.Paranormal_ESP_Arc);
          
        System.out.println("Articuno: Perdon por comerme tu gansito,te voy a comprar 2");
        System.out.println("Moltres: Bueno,Muchas gracias:)");
    }
    
}
