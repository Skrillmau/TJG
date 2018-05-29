/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servlets;

import Modelo.Cargo;
import Modelo.Cliente;
import Modelo.Departamento;
import Modelo.Empleado;
import Modelo.Producto;
import SQL.CargoC;
import SQL.ClienteC;
import SQL.Conexion;
import SQL.DepartamentoC;
import SQL.EmpleadoC;
import SQL.ProductoC;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.sql.Connection;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;

@WebServlet("/upload")
@MultipartConfig

/**
 *
 * @author juanc
 */
public class Registroc extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        String URL = request.getServletPath();
        if (URL.equals("/Registroc")) {
            String user = request.getParameter("user");
            String pass = request.getParameter("pass");
            String nombres = request.getParameter("nombres");
            String cedula = request.getParameter("cedula");
            String correo = request.getParameter("correo");
            String telefono = request.getParameter("telefono");
            String direccion = request.getParameter("direccion");
            String ciudad = request.getParameter("ciudad");
            String mediocontatco = request.getParameter("mediocontatco");
            Conexion con = new Conexion();
            Connection cn = con.conectar();
            ClienteC clientec = new ClienteC(cn);
            Cliente cliente = new Cliente();
            cliente.setCedula(Integer.parseInt(cedula));
            cliente.setNombres(nombres);
            cliente.setCiudad(ciudad);
            cliente.setCorreo(correo);
            cliente.setDireccion(direccion);
            cliente.setMedio_contacto(mediocontatco);
            cliente.setPassword(pass);
            cliente.setTelefono(Integer.parseInt(telefono));
            cliente.setUsuario(user);
            clientec.insert(cliente);
        } else if (URL.equals("/Registroe")) {
            String user = request.getParameter("user");
            String pass = request.getParameter("pass");
            String nombres = request.getParameter("nombres");
            String cedula = request.getParameter("cedula");
            String duracion = request.getParameter("duracion");
            String eps = request.getParameter("eps");
            String arl = request.getParameter("arl");
            String rh = request.getParameter("rh");
            String caja = request.getParameter("caja");
            String fondo = request.getParameter("fondo");
            String iddep = request.getParameter("iddeppartamentos");
            String tipo = request.getParameter("tipoempleado");
            String idcargo = request.getParameter("idcargo");

            Conexion con = new Conexion();
            Connection cn = con.conectar();
            EmpleadoC empleadoc = new EmpleadoC(cn);
            Empleado empleado = new Empleado();
            empleado.setCedula(Integer.parseInt(cedula));
            empleado.setNombres(nombres);
            empleado.setDuracion(Integer.parseInt(duracion));
            empleado.setEps(eps);
            empleado.setArl(arl);
            empleado.setRh(rh);
            empleado.setCj(caja);
            empleado.setFp(fondo);
            empleado.setIdepartamento(Integer.parseInt(iddep));
            empleado.setUsuario(user);
            empleado.setPassword(pass);
            empleado.setTipo(tipo);
            empleado.setIdcargo(Integer.parseInt(idcargo));
            empleadoc.insert(empleado);
        } else if (URL.equals("/Registrodep")) {

            String nombre = request.getParameter("nombre");
            String descripcion = request.getParameter("descripcion");
            Conexion con = new Conexion();
            Connection cn = con.conectar();
            DepartamentoC departamentoc = new DepartamentoC(cn);
            Departamento departamento = new Departamento();
            departamento.setNombre(nombre);
            departamento.setDescribe(descripcion);
            departamentoc.insert(departamento);
            RequestDispatcher rd;
            rd = request.getRequestDispatcher("/home.jsp");
            rd.forward(request, response);
        } else if (URL.equals("/Registrocar")) {
            String idcargo = request.getParameter("idcargo");
            String objetivo = request.getParameter("objetivo");
            String comisiones = request.getParameter("comisiones");
            String memorandos = request.getParameter("memorandos");
            String nombre = request.getParameter("nombre");
            Conexion con = new Conexion();
            Connection cn = con.conectar();
            CargoC cargoc = new CargoC(cn);
            Cargo cargo = new Cargo();
            cargo.setComisiones(Double.parseDouble(comisiones));
            cargo.setIdcargo(Integer.parseInt(idcargo));
            cargo.setObjetivoventas(Integer.parseInt(objetivo));
            cargo.setMemorandos(Integer.parseInt(memorandos));
            cargo.setNombrecargo(nombre);
            cargoc.insert(cargo);
            RequestDispatcher rd;
            rd = request.getRequestDispatcher("/home.jsp");
            rd.forward(request, response);
        }
        RequestDispatcher rd;
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
        String URL = request.getServletPath();

        if (URL.equals("/Registrop")) {
            String id = request.getParameter("idproducto");
            String nombre = request.getParameter("nombre");
            String inventario = request.getParameter("inventario");
            String precio = request.getParameter("precio");
            String idproveedor = request.getParameter("idproveedor");
            Part filePart = request.getPart("imagenp");
            String fileName = Paths.get(filePart.getSubmittedFileName()).getFileName().toString();
            String path = "C:\\Users\\mate_\\Documents\\GitHub\\TheJourneyGroup\\web\\Productos";
            File uploads = new File(path);
            uploads.mkdirs();
            File file = File.createTempFile("cod" + "1203" + "XX", "XX" + fileName, uploads);
            try (InputStream input = filePart.getInputStream()) {
                Files.copy(input, file.toPath(), StandardCopyOption.REPLACE_EXISTING);
            }

            String[] Parts = (file.getPath().split("XX"));
            String ruta = ("cod1203XX" + Parts[1] + "XX" + fileName);
            Conexion con = new Conexion();
            Connection cn = con.conectar();
            ProductoC productoc = new ProductoC(cn);
            Producto producto = new Producto();
            producto.setPath(ruta);
            producto.setIdproducto(Integer.parseInt(id));
            producto.setNombreproducto(nombre);
            producto.setInventario(Integer.parseInt(inventario));
            producto.setPrecio(Integer.parseInt(precio));
            producto.setIdproveedor(Integer.parseInt(idproveedor));
            productoc.insert(producto);

        }
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
