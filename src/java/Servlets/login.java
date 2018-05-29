/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servlets;

import Modelo.Cliente;
import Modelo.Empleado;
import Modelo.Tipos;
import SQL.ClienteC;
import SQL.Conexion;
import SQL.EmpleadoC;
import SQL.TiposC;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.util.ArrayList;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author juanc
 */
public class login extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    HttpSession session;

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        String URL = request.getServletPath();
        String user = request.getParameter("user");
        String pass = request.getParameter("pass");
        Conexion con = new Conexion();
        Connection cn = con.conectar();

        if (URL.equals("/login")) {
            session = request.getSession(false);
            EmpleadoC emp = new EmpleadoC(cn);
            Empleado emple = new Empleado();
            emple = emp.auth(user, pass);
            RequestDispatcher rd;
            if (emple != null) {
                session.setAttribute("empleado", emple);
                rd = request.getRequestDispatcher("/home.jsp");
                rd.forward(request, response);
            } else {
                rd = request.getRequestDispatcher("/index.jsp");
                rd.forward(request, response);
            }

        } else if (URL.equals("/loginc")) {

            ClienteC clientec = new ClienteC(cn);
            Cliente cliente = new Cliente();
            cliente = clientec.auth(user, pass);
            RequestDispatcher rd;
            if (cliente != null) {
                session = request.getSession(true);
                session.setAttribute("cliente", cliente);
                rd = request.getRequestDispatcher("/homecliente.jsp");
                rd.forward(request, response);
            } else {
                rd = request.getRequestDispatcher("/loginClientes.jsp");
                rd.forward(request, response);
                try (PrintWriter out = response.getWriter()) {
                    out.println("alert(choka marik)");

                }
            }

        }

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
