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
public class DistritoZonanueva extends Distrito
              implements DistritoNuevo,Navegador {
    
    private String Ubicacion;
    private String Referencia;
    private String Calle;
    private String Distrito;
    
    private String espacio;
    

    public DistritoZonanueva() {
        this.espacio = "n";
    }
    
    @Override
    public String getNombre() {
     return "Distrito: "+ Distrito + "<html><br></html>" + " Ubicacion: " + Ubicacion 
             + " Referencia: " + Referencia +
             " Calle: " + Calle ; 
    }
    

    public String getUbicacion() {
        return Ubicacion;
    }

    public void setUbicacion(String Ubicacion) {
        this.Ubicacion = Ubicacion;
    }

    public String getReferencia() {
        return Referencia;
    }

    public void setReferencia(String Referencia) {
        this.Referencia = Referencia;
    }

    public String getCalle() {
        return Calle;
    }

    public void setCalle(String Calle) {
        this.Calle = Calle;
    }

    public String getDistrito() {
        return Distrito;
    }

    public void setDistrito(String Distrito) {
        this.Distrito = Distrito;
    }
    

    @Override
    public void Lugar() {
        
    }

    @Override
    public void Referencia() {
        
    }

    @Override
    public void Ubicacion() {
        
    }

    @Override
    public void Calle() {
        
    }

    @Override
    public void navegar() {
        
    }

    @Override
    public void abrirLink() {
        
    }
    
}
