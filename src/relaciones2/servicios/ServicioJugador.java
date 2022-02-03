/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package relaciones2.servicios;

import java.util.ArrayList;
import relaciones2.entidades.Jugador;
import relaciones2.entidades.RevolverDeAgua;

/**
 *
 * @author lauta
 */
public class ServicioJugador {
    
    public ServicioRevolver sr = new ServicioRevolver();
    
    public void llenarJugador(ArrayList<Jugador> jugadores, int n ){
        for (int i = 0; i < n; i++) {
            jugadores.add(new Jugador());
        }
    
    }
    
    
    public boolean disparo(RevolverDeAgua rev, Jugador j) {
        if (sr.mojar(rev)) {
            j.setMojado(true);
            return true;
        } else {
            sr.siguienteChorro(rev);
            return false;
        }
    }
    
}
