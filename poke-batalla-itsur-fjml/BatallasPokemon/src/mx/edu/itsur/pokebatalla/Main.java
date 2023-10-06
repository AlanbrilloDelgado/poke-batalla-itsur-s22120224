package mx.edu.itsur.pokebatalla;
/**
 *
 * @author AlanG
 */

import mx.edu.itsur.pokebatalla.model.Bullbasaur;
import mx.edu.itsur.pokebatalla.model.Pikachu;
import mx.edu.itsur.pokebatalla.model.Charmander;
import mx.edu.itsur.pokebatalla.model.Articuno;
import mx.edu.itsur.pokebatalla.model.Zapdos;
import mx.edu.itsur.pokebatalla.model.Moltres;
public class Main {
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Hola Poke-entrenador!");
        
        Pikachu pikachuSalvaje = new Pikachu();
        Charmander charmanderSalvaje = new Charmander() ;
        Articuno art = new Articuno();
        Zapdos zpd = new Zapdos();
        Moltres mts = new Moltres();
        
        //Realizar la captura del pikachu salvaje
        pikachuSalvaje.setNombre("  Pikachu  ");        
        Pikachu miPikapika = pikachuSalvaje;
        Articuno miHielito= art;
        Zapdos miRayito = zpd;
        Moltres miFueguito = mts;
        
        miPikapika.atacar(charmanderSalvaje);
        
        miPikapika.atacar(charmanderSalvaje, "ATACKTRUENO");
        
        art.setNombre("  Articuno  ");
        miHielito.atacar(charmanderSalvaje);
        art.atacar(charmanderSalvaje, "TORNADO");
        
        zpd.setNombre("  Zapdos  ");
        miRayito.atacar(art);
        miRayito.atacar(art, "PICOTAZO");
        
        //Mewtwo
        mts.setNombre("  MOLTRES  ");
        miFueguito.atacar(miRayito);
        miFueguito.atacar(zpd, "ASCUAS");
       
     
}
}
