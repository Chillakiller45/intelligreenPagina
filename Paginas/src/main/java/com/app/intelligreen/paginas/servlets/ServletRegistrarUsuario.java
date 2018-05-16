/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.app.intelligreen.paginas.servlets;

import com.app.intelligreen.ejb.EjbUsuarios;
import com.app.intelligreen.paginas.entity.Usuarios;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Admin
 */
public class ServletRegistrarUsuario extends HttpServlet {
   
    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /** 
     * Handles the HTTP <code>GET</code> method.
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
        request.getRequestDispatcher("/registro/registroUsuario.jsp").forward(request, response);
    } 

    /** 
     * Handles the HTTP <code>POST</code> method.
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
        String nombreUsuario = request.getParameter("textNombreUsuario");
        String correo = request.getParameter("textCorreoElectronico");
        String contra = request.getParameter("textClave");
        Usuarios usuario = new Usuarios();
        usuario.setClave(contra);
        usuario.setCorreoMail(correo);
        usuario.setNombreUsuario(nombreUsuario);
        EjbUsuarios ejbUsuarios = new EjbUsuarios();
        ejbUsuarios.altas(usuario);
        request.getRequestDispatcher("/registro/registroExitoso").forward(request, response);
    }

}
