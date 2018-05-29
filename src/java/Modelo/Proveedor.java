/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author mate_
 */
public class Proveedor {
    
    private int Idproveedor;
    private String Razonsocial;
    private String Direccion;
    private String Correo;
    private int Telefono;
    private int cerban;
    private int Rut;
    
    public Proveedor(){
        
    }

    public int getIdproveedor() {
        return Idproveedor;
    }

    public void setIdproveedor(int Idproveedor) {
        this.Idproveedor = Idproveedor;
    }

    public String getRazonsocial() {
        return Razonsocial;
    }

    public void setRazonsocial(String Razonsocial) {
        this.Razonsocial = Razonsocial;
    }

    public String getDireccion() {
        return Direccion;
    }

    public void setDireccion(String Direccion) {
        this.Direccion = Direccion;
    }

    public String getCorreo() {
        return Correo;
    }

    public void setCorreo(String Correo) {
        this.Correo = Correo;
    }

    public int getTelefono() {
        return Telefono;
    }

    public void setTelefono(int Telefono) {
        this.Telefono = Telefono;
    }

    public int getCerban() {
        return cerban;
    }

    public void setCerban(int cerban) {
        this.cerban = cerban;
    }

    public int getRut() {
        return Rut;
    }

    public void setRut(int Rut) {
        this.Rut = Rut;
    }
    
    
}
