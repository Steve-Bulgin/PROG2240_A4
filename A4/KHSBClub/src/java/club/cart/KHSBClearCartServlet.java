/* FileName: KHSBClearCartServlet.java
 * Purpose: 
 *          
 * Revision History:
 *          Khaleel Hamid & Steve Bulgin, 2015.03.14: Created
 */


package club.cart;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import javax.servlet.http.HttpSession;
import javax.servlet.ServletContext;
import club.business.Book;
import club.business.ECart;
import club.business.ELoan;
import club.data.BookIO;
import java.util.ArrayList;


/**
 *
 * @author Steve
 */
public class KHSBClearCartServlet extends HttpServlet {

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
        
        String url = "";
        HttpSession session = request.getSession();
        
        ECart cart = (ECart) session.getAttribute("cart"); 
        ArrayList<Book> cartitems = cart.getItems();
        ServletContext context = getServletContext();
        String path = getServletContext().getRealPath("/WEB-INF/books.txt");
        ArrayList<Book> loanitems = ELoan.loadItems(path);
        
        
        for (Book book : cartitems){
            String code = book.getCode(); 
            int qty = book.getQuantity();
            ELoan.addToQOH(loanitems, code , qty);
            BookIO.update(book, path);
        }
            
        
        
        session.invalidate();
        url = "/KHSBECart.jsp";
        
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
