/* FileName: KHSBAddBookServlet.java
 * Purpose: Validates inputs from KHSBAddBooks.jsp if they pass get added to
 *          books.txt. Fail sends user and info back to KHSBAddBooks.jsp
 * Revision History:
 *          Khaleel Hamid & Steve Bulgin, 2015.02.20: Created
 */


package club.admin;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.*;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import club.data.BookIO;
import club.business.Book;

/**
 *
 * @author Steve
 */
@WebServlet(name = "KHSBAddBookServlet", urlPatterns = {"/KHSBAddBook"})
public class KHSBAddBookServlet extends HttpServlet {

    

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
    protected void doGet(HttpServletRequest request, 
            HttpServletResponse response)
            throws ServletException, IOException {
        
        doPost(request, response);
        
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
    protected void doPost(HttpServletRequest request, 
            HttpServletResponse response)
            throws ServletException, IOException {
        
        String url = "/KHSBAddBook.jsp";
        String code = request.getParameter("code");
        String description = request.getParameter("description");
        String quantity = request.getParameter("quantity");
        Integer qtyint =0;
        String errorMsg = "";
        
        
        try{
            
            qtyint = Integer.parseInt(quantity);
              
        
        }
        catch(NumberFormatException n){
            qtyint = 0;
            
        
        }
        
        Book book = new Book(code, description, qtyint);
        
        if (code == null || code.equals("")) {
            errorMsg += "<p id=\"error\">Book code is required.</p>";
        }
        if (description.length() < 2) {
            errorMsg += 
                    "<p id=\"error\">Description must have at least 2 characters.</p>";
        }
        
        if (qtyint <= 0) {
                errorMsg += 
                        "<p id=\"error\">Quantity must be a positive number.</p>";
            }
        
        if (errorMsg.equals("")) {
            url = "/KHSBDisplayBooks";
            
            ServletContext context = getServletContext();
            String path = context.getRealPath("/WEB-INF/books.txt");
            
            BookIO.insert(book, path);
        }
        else{
            url = "/KHSBAddBook.jsp";
        }
        request.setAttribute("book", book);
        request.setAttribute("errorMsg", errorMsg);
        request.setAttribute("quantity", quantity);
        
        getServletContext()
                .getRequestDispatcher(url)
                .forward(request, response);
        
    }

    
}

