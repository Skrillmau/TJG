
package Modelo;

/**
 *
 * @author mate_
 */
public class Departamento {
    
    private int Iddepartamento;
    private String Nombre;
    private String Describe;
    private int Cedulagerente;
    
    public Departamento(){
        
    }

    public int getIddepartamento() {
        return Iddepartamento;
    }

    public void setIddepartamento(int Iddepartamento) {
        this.Iddepartamento = Iddepartamento;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getDescribe() {
        return Describe;
    }

    public void setDescribe(String Describe) {
        this.Describe = Describe;
    }

    public int getCedulagerente() {
        return Cedulagerente;
    }

    public void setCedulagerente(int Cedulagerente) {
        this.Cedulagerente = Cedulagerente;
    }
    
}
