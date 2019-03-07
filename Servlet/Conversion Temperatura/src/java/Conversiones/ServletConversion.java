/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Conversiones;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author bzamb
 */
@WebServlet(name = "ServletConversion", urlPatterns = {"/ServletConversion"})
public class ServletConversion extends HttpServlet {
private double celsius;
private double fahrenheit;

    public double getCelsius() {
        return celsius;
    }

    public void setCelsius(double celsius) {
        this.celsius = celsius;
    }

    public double getFahrenheit() {
        return fahrenheit;
    }

    public void setFahrenheit(double fahrenheit) {
        this.fahrenheit = fahrenheit;
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
            out.println("<title>Servlet ServletConversion</title>");            
            out.println("</head>");
            out.println("<body><div>\n" +
"            <form action=\"ServletConversion\" method=\"POST\">\n" +
"                <table border=\"1\" bordercolor=\"blue\"> \n" +
"                    <tr>\n" +
"                        <th>Fahrenheit:<input name=\"fahrenheit\" ></th>\n" +
"                    </tr>\n" +
"                    <tr>\n" +
"                        <th>Celsius:<input name=\"celsius\"</th>\n" +
"                    </tr>\n" +
"                    <tr>\n" +
"                           <th><input type=\"submit\" value=\"Enviar\" name=\"Enviar\"></th>\n" +
"                    </tr>\n" +
"                </table>\n" +
"            </form>\n" +
"        </div>");
            out.println("<table border=\"1\" bordercolor=\"blue\"> \n" +
                  "<tr>\n"+"<th> Resultado Celsius :"+celsius+"</th>\n"
                          + "</tr>\n"+
                  "<tr>\n"+"<th> Resultado fahrenheit:"+fahrenheit+"</th>\n"
                          + "</tr>\n");
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
        celsius=Double.parseDouble(request.getParameter("celsius")); 
        fahrenheit=Double.parseDouble(request.getParameter("fahrenheit"));
        Formulas F=new Formulas();
        request.setAttribute("fahrenheit",fahrenheit );
        request.setAttribute("celsius",celsius );
        fahrenheit=F.celsiusaFahrenheit(Double.parseDouble(request.getParameter("celsius")));
        celsius=F.fahrenheitaCelsius(Double.parseDouble(request.getParameter("fahrenheit")));
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
