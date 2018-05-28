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
public class FacturaDetalle {
    
    private int Idfactura;
    private int Idproducto;
    private int Cantidad;
    
    public FacturaDetalle(){
        
    }

    public int getIdfactura() {
        return Idfactura;
    }

    public void setIdfactura(int Idfactura) {
        this.Idfactura = Idfactura;
    }

    public int getIdproducto() {
        return Idproducto;
    }

    public void setIdproducto(int Idproducto) {
        this.Idproducto = Idproducto;
    }

    public int getCantidad() {
        return Cantidad;
    }

    public void setCantidad(int Cantidad) {
        this.Cantidad = Cantidad;
    }
    
    
}
