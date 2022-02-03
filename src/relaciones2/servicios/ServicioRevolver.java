/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package relaciones2.servicios;

import relaciones2.entidades.RevolverDeAgua;

/**
 *
 * @author lauta
 */
public class ServicioRevolver {

    public void llenarRevolver(RevolverDeAgua rev) {
        rev.setPosicionActual((int) (Math.random() * 6));
        rev.setPosicionAgua((int) (Math.random() * 6));
    }

    public boolean mojar(RevolverDeAgua rev) {
        if (rev.getPosicionActual() == rev.getPosicionAgua()) {
            return true;
        } else {
            return false;
        }
    }

    public void siguienteChorro(RevolverDeAgua rev) {

        if(rev.getPosicionActual() != 5){
        rev.setPosicionActual(rev.getPosicionActual() + 1);
        }else{
        rev.setPosicionActual(0);
        }
    }

}
