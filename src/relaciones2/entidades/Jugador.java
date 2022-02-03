/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package relaciones2.entidades;

import relaciones2.servicios.ServicioRevolver;

/**
 *
 * @author lauta
 */
public class Jugador {
    private static int id = 0;
    private String nombre = "jugador " + id;
    private boolean mojado = false;

    public Jugador() {
        this.id = id + 1;
    }
    
    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean isMojado() {
        return mojado;
    }

    public void setMojado(boolean mojado) {
        this.mojado = mojado;
    }

    @Override
    public String toString() {
        return "Jugador{" + "nombre=" + nombre + ", mojado=" + mojado + '}';
    }
    
    
    
    public boolean disparo(ServicioRevolver sr, RevolverDeAgua rev) {
        if (sr.mojar(rev)) {
            mojado = true;
            return true;
        } else {
            sr.siguienteChorro(rev);
            return false;
        }
    }
    
    
}
