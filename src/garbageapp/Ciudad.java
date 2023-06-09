/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package garbageapp;

/**
 *
 * @author Personal
 */
public abstract class Ciudad {
    
    protected String nombreCiudad;
    
    public Ciudad(String nombreCiudad) {
        this.nombreCiudad = nombreCiudad;
    }
    
    public void mostrarInformacion() {
        System.out.println("Ciudad: " + nombreCiudad);
    }
    
}
