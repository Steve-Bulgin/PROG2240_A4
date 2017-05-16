/* FileName: KHSBMemberAdminController.java
 * Purpose: Controls CRUD in the db
 * Revision History:
 *          Khaleel Hamid & Steve Bulgin, 2015.04.04: Created
 */


package club.admin;

import club.business.Member;
import club.data.MemberDB;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


/**
 *
 * @author Khaleel
 */
@WebServlet(name = "KHSBMemberAdminController", urlPatterns = {"/KHSBMemberAdmin"})
public class KHSBMemberAdminController extends HttpServlet {
    
   

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
        
        ServletContext context = request.getServletContext();
        ArrayList<Member> members = MemberDB.selectMembers();
        
        HttpSession session = request.getSession();
        session.setAttribute("members", members);
        
       
        String action = request.getParameter("action");
        String url = "/KHSBDisplayMembers.jsp";
        String errMsg = "";
        String name = "";
        String email = "";
        String phone = "";
        String program = "";
        String year = "";
        
        
        
        if (action == null) {
            action = "displayMembers";
        
        
        
        
        url = "/KHSBDisplayMembers.jsp";
        }
        else if (action.equals("addMember")) {
        
            url = "/KHSBRegister.jsp";
            
        }
        else if (action.equals("update")) {
            email = request.getParameter("email");
            url = "/KHSBRegister.jsp";
        }
        else if (action.equals("updateMember")) {
            
            email = request.getParameter("email");
            
            if (MemberDB.emailExists(email)) {
                
                name = request.getParameter("fullname");
                phone = request.getParameter("phone");
                program = request.getParameter("program");
                year = request.getParameter("year");
                int yearLevel = Integer.parseInt(year);
                
                Member member = MemberDB.selectMember(email);
                
                member.setFullName(name);
                member.setPhoneNumber(phone);
                member.setProgramName(program);
                member.setYearLevel(yearLevel);
                
                if (member.isValid() == true) {
                    
                    MemberDB.update(member);
                    session.invalidate();
                
                    url = "/KHSBMemberAdmin?action=displayMembers";
                }
                else{
                    errMsg = "<p id=\"error\">Member information is not valid. "
                            + "You must enter a valid name and email</p>";
                    url = "/KHSBRegister.jsp";
                }
            }
            else{
                name = request.getParameter("fullname");
            
                phone = request.getParameter("phone");
                program = request.getParameter("program");
                year = request.getParameter("year");
                int yearLevel = Integer.parseInt(year);
            
                Member member = new Member();
                member.setFullName(name);
                member.setEmailAddress(email);
                member.setPhoneNumber(phone);
                member.setProgramName(program);
                member.setYearLevel(yearLevel);
                
                if (member.isValid() == true) {
                
                    MemberDB.insert(member);
                    session.invalidate();
                    url = "/KHSBMemberAdmin?action=displayMembers";
                }
                else {
                    
                    errMsg = "<p id=\"error\">Member information is not valid. "
                            + "You must enter a valid name and email</p>";
                    url = "/KHSBRegister.jsp";
                
                }
                
                
            }
            
            
        }
        else if (action.equals("confirmDeleteMember")) {
            
            email = request.getParameter("email");
            
            url = "/KHSBConfirmMemberDelete.jsp";
            
        }
        else if (action.equals("yes")) {
            
            email = request.getParameter("email");
            Member member = new Member();
            member = MemberDB.selectMember(email);
            MemberDB.delete(member);
            session.invalidate();
                
            url = "/KHSBMemberAdmin?action=displayMembers";
            
        }
        request.setAttribute("errMsg", errMsg);
        
        request.setAttribute("email", email);
        request.setAttribute("name", name);
        request.setAttribute("phone", phone);
        request.setAttribute("program", program);
        request.setAttribute("year", year);
        getServletContext().getRequestDispatcher(url).forward(request, response);
    }
    
    

    
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
