/* FileName: KHSBAddBookServlet.java
 * Purpose: Reads books.txt file into an array and returns it to 
 *          KHSBDisplaybooks.jsp
 * Revision History:
 *          Khaleel Hamid & Steve Bulgin, 2015.02.16: Created
 */

package club.admin;

import club.data.BookIO;
import club.business.Book;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Steve
 */
@WebServlet(name = "KHSBDisplayBooksServlet", urlPatterns = {"/KHSBDisplayBooks"})
public class KHSBDisplayBooksServlet extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        String path = getServletContext().getRealPath("/WEB-INF/books.txt");
        ArrayList<Book> books = BookIO.getBooks(path);
        request.setAttribute("books", books);
        
        String url = "/KHSBDisplaybooks.jsp";
        
       
        
        getServletContext().getRequestDispatcher(url).forward(request, response);
        
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. 
    //Click on the + sign on the left to edit the code.">
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

    

}
