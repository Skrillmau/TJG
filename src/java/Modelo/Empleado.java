package Modelo;

/**
 *
 * @author juanc
 */
public class Empleado {

    private int Cedula;
    private String Usuario;
    private String Password;
    private String Tipo;
    private String Nombres;
    private String Eps;
    private String Arl;
    private String Rh;
    private String Cj;
    private String Fp;
    private int Idepartamento;
    
    public Empleado(){
        
    }

    public int getCedula() {
        return Cedula;
    }

    public void setCedula(int Cedula) {
        this.Cedula = Cedula;
    }

    public String getUsuario() {
        return Usuario;
    }

    public void setUsuario(String Usuario) {
        this.Usuario = Usuario;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String Password) {
        this.Password = Password;
    }

    public String getTipo() {
        return Tipo;
    }

    public void setTipo(String Tipo) {
        this.Tipo = Tipo;
    }

    public String getNombres() {
        return Nombres;
    }

    public void setNombres(String Nombres) {
        this.Nombres = Nombres;
    }

    public String getEps() {
        return Eps;
    }

    public void setEps(String Eps) {
        this.Eps = Eps;
    }

    public String getArl() {
        return Arl;
    }

    public void setArl(String Arl) {
        this.Arl = Arl;
    }

    public String getRh() {
        return Rh;
    }

    public void setRh(String Rh) {
        this.Rh = Rh;
    }

    public String getCj() {
        return Cj;
    }

    public void setCj(String Cj) {
        this.Cj = Cj;
    }

    public String getFp() {
        return Fp;
    }

    public void setFp(String Fp) {
        this.Fp = Fp;
    }

    public int getIdepartamento() {
        return Idepartamento;
    }

    public void setIdepartamento(int Idepartamento) {
        this.Idepartamento = Idepartamento;
    }
    
}
