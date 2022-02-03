/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package relaciones2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import relaciones2.entidades.Juego;
import relaciones2.entidades.Jugador;
import relaciones2.entidades.RevolverDeAgua;
import relaciones2.servicios.ServicioJuego;
import relaciones2.servicios.ServicioRevolver;

/**
 *
 * @author lauta
 */
public class Relaciones2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
  
        ServicioJuego sj = new ServicioJuego();
        Juego juego = sj.llenarJuego();
        
        
        sj.ronda(juego);
        
        sj.jugadorMojado(juego);
        
        
        
    }
    
}
