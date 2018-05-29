package Modelo;

public class Producto {
    private int Idproducto;
    private String Nombreproducto;
    private int Idproveedor;
    private int Inventario;
    private double Precio;
    private String Path;
    
    public Producto(){
        
    }

    public int getIdproducto() {
        return Idproducto;
    }

    public void setIdproducto(int Idproducto) {
        this.Idproducto = Idproducto;
    }

    public String getNombreproducto() {
        return Nombreproducto;
    }

    public void setNombreproducto(String Nombreproducto) {
        this.Nombreproducto = Nombreproducto;
    }

    public int getIdproveedor() {
        return Idproveedor;
    }

    public void setIdproveedor(int Idproveedor) {
        this.Idproveedor = Idproveedor;
    }

    public int getInventario() {
        return Inventario;
    }

    public void setInventario(int Inventario) {
        this.Inventario = Inventario;
    }

    public double getPrecio() {
        return Precio;
    }

    public void setPrecio(double Precio) {
        this.Precio = Precio;
    }

    public String getPath() {
        return Path;
    }

    public void setPath(String Path) {
        this.Path = Path;
    }
    
}
