package Modelo;

public class Empresa {
    private int Nit;
    private String Nombre;
    private String Replegal;
    private String Direccion;
    private int Telefono;
    private int Sucursales;
    private int Cuentabancaria;
    
    public Empresa(){
        
    }

    public int getNit() {
        return Nit;
    }

    public void setNit(int Nit) {
        this.Nit = Nit;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getReplegal() {
        return Replegal;
    }

    public void setReplegal(String Replegal) {
        this.Replegal = Replegal;
    }

    public String getDireccion() {
        return Direccion;
    }

    public void setDireccion(String Direccion) {
        this.Direccion = Direccion;
    }

    public int getTelefono() {
        return Telefono;
    }

    public void setTelefono(int Telefono) {
        this.Telefono = Telefono;
    }

    public int getSucursales() {
        return Sucursales;
    }

    public void setSucursales(int Sucursales) {
        this.Sucursales = Sucursales;
    }

    public int getCuentabancaria() {
        return Cuentabancaria;
    }

    public void setCuentabancaria(int Cuentabancaria) {
        this.Cuentabancaria = Cuentabancaria;
    }
}
