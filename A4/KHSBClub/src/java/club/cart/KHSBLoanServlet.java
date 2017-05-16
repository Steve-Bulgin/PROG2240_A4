/* FileName: KHSBLoanServlet.java
 * Purpose: To compile an ArrayList of books in the context and forward it to 
 *          KHSBELoan.jsp
 * Revision History:
 *          Khaleel Hamid & Steve Bulgin, 2015.03.14: Created
 */

package club.cart;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.ArrayList;

import club.business.ELoan;
import club.business.Book;
import javax.servlet.http.HttpSession;
import javax.servlet.jsp.PageContext;


/**
 *
 * @author Steve
 */

public class KHSBLoanServlet extends HttpServlet {

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
        
            
            String url = "/KHSBELoan.jsp";
            ServletContext context = getServletContext();
            String path = getServletContext().getRealPath("/WEB-INF/books.txt");
            ArrayList<Book> loanitems = ELoan.loadItems(path);
            
           context.setAttribute("loanitems", loanitems);
            
            getServletContext().getRequestDispatcher(url).forward(request, response);
            
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
