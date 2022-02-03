/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package relaciones2.servicios;

import java.util.ArrayList;
import java.util.Scanner;
import relaciones2.entidades.Juego;
import relaciones2.entidades.Jugador;
import relaciones2.entidades.RevolverDeAgua;

/**
 *
 * @author lauta
 */
public class ServicioJuego {

    ServicioRevolver sr = new ServicioRevolver();
    ServicioJugador sj = new ServicioJugador();

    public Juego llenarJuego() {
        Juego j = new Juego();
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Introduzca la cantidad de jugadores (max 6)");
        int cantidad = leer.nextInt();
        
        if (cantidad < 1 || cantidad > 6) {
            cantidad = 6;
        }
        
        ArrayList<Jugador> jugadores = new ArrayList();
        sj.llenarJugador(jugadores, cantidad);
        j.setJugadores(jugadores);
        
        RevolverDeAgua rev = new RevolverDeAgua();
        sr.llenarRevolver(rev);
        j.setRevolver(rev);
        
        return j;
    }

    public void ronda(Juego j) {
        boolean juego = true;

        while (juego) {
            for (int i = 0; i < j.getJugadores().size(); i++) {


                if (sj.disparo(j.getRevolver(), j.getJugadores().get(i))) {
                    juego = false;
                    break;
                }

            }
        }
    }

    public void jugadorMojado(Juego j) {
        for (int i = 0; i < j.getJugadores().size(); i++) {

            if (j.getJugadores().get(i).isMojado()) {
                System.out.println("El jugador mojado es el: " + j.getJugadores().get(i).getNombre());
            }

        }
    }

}
