package Modelo;

public class Cargo {
    private int Idcargo;
    private int Objetivoventas;
    private double Comisiones;
    private int Memorandos;
    private String Nombrecargo;
    
    public Cargo(){
        
    }

    public int getIdcargo() {
        return Idcargo;
    }

    public void setIdcargo(int Idcargo) {
        this.Idcargo = Idcargo;
    }

    public int getObjetivoventas() {
        return Objetivoventas;
    }

    public void setObjetivoventas(int Objetivoventas) {
        this.Objetivoventas = Objetivoventas;
    }

    public double getComisiones() {
        return Comisiones;
    }

    public void setComisiones(double Comisiones) {
        this.Comisiones = Comisiones;
    }

    public int getMemorandos() {
        return Memorandos;
    }

    public void setMemorandos(int Memorandos) {
        this.Memorandos = Memorandos;
    }

    public String getNombrecargo() {
        return Nombrecargo;
    }

    public void setNombrecargo(String Nombrecargo) {
        this.Nombrecargo = Nombrecargo;
    }
}
