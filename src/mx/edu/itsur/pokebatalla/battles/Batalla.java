/**
 *
 * @author Alan Armando Garcia Guzman
 */
package mx.edu.itsur.pokebatalla.battles;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Serializable;
import mx.edu.itsur.pokebatalla.model.Archivos.Filemager;
import mx.edu.itsur.pokebatalla.model.pokemons.Pokemon;

public class Batalla implements Serializable {

    protected Entrenador entrenador1;
    protected Entrenador entrenador2;
    protected int turno = 1;
    protected boolean batallaFinalizada = false;

    private boolean primerAtaqueRealizado = false;

    public Batalla(Entrenador entrenador1, Entrenador entrenador2) {
        this.entrenador1 = entrenador1;
        this.entrenador2 = entrenador2;
    }

    public void Guardar() {
        Filemager.guardarPartida(this);
    }

    public void desarrollarBatalla() {
        System.out.println(" Batalla ");
        System.out.println("Pelea entre ");
        System.out.println(entrenador1.getNombre() + "    contra  " + entrenador2.getNombre());

        System.out.println("");

        do {
            try {
                eligirPokemon(entrenador1);
            } catch (IndexOutOfBoundsException e) {
                System.out.println("Recuerda añadir solo numeros enteros,(Hay un limite de 1-2)");
                System.out.println("Solamente cuentas con:  " + "{" + entrenador1.getPokemonsCapturados().size() + "}" + "  Elige alguno de tus Pokemons");
                entrenador1.setPokemonActual(null);
            }
        } while (entrenador1.getPokemonActual() == null);

        do {
            try {
                eligirPokemon(entrenador2);
            } catch (IndexOutOfBoundsException e) {
                System.out.println("Recuerda añadir solo numeros enteros,(Hay un limite de 1-2)");
                System.out.println("Solamente cuentas con:  " + "{" + entrenador2.getPokemonsCapturados().size() + "}" + "  Elige alguno de tus Pokemons");
                entrenador2.setPokemonActual(null);
            }
        } while (entrenador2.getPokemonActual() == null);

        while (!batallaFinalizada) {
            Entrenador entrenadorEnTurno = (turno == 1) ? entrenador1 : entrenador2;
            Entrenador oponente = (turno == 1) ? entrenador2 : entrenador1;

            System.out.println("Turno del entrenador: " + entrenadorEnTurno.getNombre());

            if (entrenadorEnTurno.getPokemonActual() == null || entrenadorEnTurno.getPokemonActual().gethp() <= 0) {
                cambiarPokemon(entrenadorEnTurno);
            }

            if (oponente.getPokemonActual() == null) {
                System.out.println("El oponente no ha a seleccionado un pokemon actual");
                return;
            }

            seleccionarAtaque(entrenadorEnTurno, oponente.getPokemonActual());

            Pokemon pokemonEnTurno = entrenadorEnTurno.getPokemonActual();

            if (oponente.estaDerrotado()) {
                System.out.println("El personaje " + oponente.getNombre() + "Se fue");
                batallaFinalizada = true;
            } else {
                Guardar();
                turno = (turno == 1) ? 2 : 1;
            }
        }
    }

    private void eligirPokemon(Entrenador EnTn) {
        int idx = 1;
        System.out.println("");
        System.out.println("Elige un  pokemon " + EnTn.getNombre());
        for (Pokemon pokemon : EnTn.getPokemonsCapturados()) {
            if (pokemon.gethp() < 0) {
                System.out.println(idx + ".- " + pokemon.getClass().getSimpleName() + "  0");
            } else {
                System.out.println(idx + ".- " + pokemon.getClass().getSimpleName() + " " + pokemon.gethp());
            }
            idx++;
        }
        char auxLectura = '0';

        try {
            auxLectura = (char) System.in.read();
            System.in.read((new byte[System.in.available()]));
        } catch (Exception ex) {
            ex.printStackTrace();
        }

        Pokemon pokemonSeleccionado = EnTn.getPokemonsCapturados()
                .get(Character.getNumericValue(auxLectura) - 1);
        EnTn.setPokemonActual(pokemonSeleccionado);
    }

    private void seleccionarAtaque(Entrenador entrenadorEnturno, Pokemon oponente) {

        Pokemon pokemonActual = entrenadorEnturno.getPokemonActual();

        System.out.println("");
        System.out.println("Seleccione un ataque para " + pokemonActual.getClass().getSimpleName() + ":");

        int idx = 1;

        for (Enum movimiento : pokemonActual.getMovimientos()) {
            System.out.println(idx + ".- " + movimiento);
            idx++;
        }
        System.out.println("");

        int opcionAtaque = -1;
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            opcionAtaque = Integer.parseInt(br.readLine());
        } catch (IOException | NumberFormatException ex) {
            System.out.println("no es un numero valido");
            return;
        }

        if (opcionAtaque < 1 || opcionAtaque > pokemonActual.getMovimientos().length) {
            System.out.println("La opción de ataque no es valida.");
            return;
        }

        entrenadorEnturno.instruirMovimientoAlPokemonActual(oponente, opcionAtaque - 1);
    }

    private void cambiarPokemon(Entrenador entrenador) {
        System.out.println("Quieres cambiar de pokemon ? ");

        char respuesta = 'N';

        try {
            respuesta = (char) System.in.read();
            System.in.read((new byte[System.in.available()]));
        } catch (IOException ex) {
            ex.printStackTrace();
        }

        if (respuesta == 'S' || respuesta == 's') {

            System.out.println("Pokemones avalibles:");
            int idx = 1;
            for (Pokemon pokemon : entrenador.getPokemonsCapturados()) {
                System.out.println(idx + ".- " + pokemon.getClass().getSimpleName());
                idx++;
            }

            System.out.println("Elige un Pokemon:");

            char auxLectura = '0';

            try {
                auxLectura = (char) System.in.read();
                System.in.read((new byte[System.in.available()]));
            } catch (IOException ex) {
                ex.printStackTrace();
            }

            Pokemon nuevoPokemon = entrenador.getPokemonsCapturados().get(Character.getNumericValue(auxLectura) - 1);
            entrenador.setPokemonActual(nuevoPokemon);

            System.out.println("Has elegido a " + nuevoPokemon.getClass().getSimpleName() + " en tu equipo.");
        }
    }
}