/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author juanc
 */
public class RegistroCompras {
    
    private int Idregistro;
    private int Idmentrega;
    private int Idformapago;
    private int precio;
    
    public RegistroCompras(){
        
        
    }

    public int getIdregistro() {
        return Idregistro;
    }

    public void setIdregistro(int Idregistro) {
        this.Idregistro = Idregistro;
    }

    public int getIdmentrega() {
        return Idmentrega;
    }

    public void setIdmentrega(int Idmentrega) {
        this.Idmentrega = Idmentrega;
    }

    public int getIdformapago() {
        return Idformapago;
    }

    public void setIdformapago(int Idformapago) {
        this.Idformapago = Idformapago;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }
    
    
    
    
}
