/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.uniminuto;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author BOG-A409-E-016
 */
@WebServlet(name = "ServletCon", urlPatterns = {"/ServletCon"})
public class ServletCon extends HttpServlet {
    private double c;
    private double f;
    private double resultadoC;
    ServletCon sc = new ServletCon();

    public double getResultadoC() {
        return resultadoC;
    }

    public void setResultadoC(double resultadoC) {
        this.resultadoC = resultadoC;
    }

    public double getResultadoF() {
        return resultadoF;
    }

    public void setResultadoF(double resultadoF) {
        this.resultadoF = resultadoF;
    }
    private double resultadoF;

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }

    public double getF() {
        return f;
    }

    public void setF(double f) {
        this.f = f;
    }
    
    

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
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet ServletCon</title>");            
            out.println("</head>");
            out.println("<body><div>\n" +
"            <form action=\"ServletCon\" method=\"POST\">\n" +
"                <table border=\"1\">\n" +
"                    <tr>\n" +
"                        <th>Fahrenheit:<input id=\"f\"></th>\n" +
"                        <th>Celsius:<input id=\"c\"></th>\n" +
"                           <th><input type=\"submit\" value=\"Enviar\" name=\"Enviar\"></th>\n" +
"                    </tr>\n" +
"                </table>\n" +
"            </form>\n" +
"        </div>"+ " <form>\n" +
"                <table border=\"1\">\n" +
"                    <tr>\n" +
"                        <th>Fahrenheit:"+sc.getResultadoF()+"</th>\n" +
"                        <th>Celsius:"+sc.getResultadoC()+"</th>\n" +
"                           <th><input type=\"submit\" value=\"Enviar\" name=\"Enviar\"></th>\n" +
"                    </tr>\n" +
"                </table>\n" +
"            </form>");
            out.println("</body>");
            out.println("</html>");
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
        c= Double.valueOf("c");
        f= Double.valueOf("f");
        formula F = new formula();
        resultadoC = F.Celsius(f);
        resultadoF = F.Fahrenheit(c);
        sc.setResultadoF(resultadoF);
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
