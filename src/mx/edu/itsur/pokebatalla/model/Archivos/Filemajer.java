/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.edu.itsur.pokebatalla.model.Archivos;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import mx.edu.itsur.pokebatalla.battles.Batalla;

/**
 *
 * @author
 */
public class Filemajer {

    public static final String pokemonPartida = "partida.txt";

    public static void guardarPartida(Batalla v) {
        try (ObjectOutputStream escritorDeObjetos = new ObjectOutputStream(new FileOutputStream(pokemonPartida))) {
            escritorDeObjetos.writeObject(v);
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    public static Batalla leerPartida() {
        Batalla v = null;
        try (ObjectInputStream lectorDeObjetos = new ObjectInputStream(new FileInputStream(pokemonPartida))) {
            v = (Batalla) lectorDeObjetos.readObject();
        } catch (EOFException e) {
        } catch (IOException | ClassNotFoundException ex) {
            ex.printStackTrace();
        }
        return v;
    }
}
