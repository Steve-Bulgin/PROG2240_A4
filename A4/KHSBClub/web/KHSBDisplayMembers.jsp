<%--
FileName: KHSBDisplayMembers.jsp
Purpose: Results page. Shows parameters grabbed from membersdb. Includes 
         KHSBBanner.jsp and KHSBFooter.jsp
Revision History
         Khaleel Hamid & Steve Bulgin, 2015.04.04: Created
--%>

<jsp:include page="KHSBBanner.jsp" />

<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

  <section>
      <h1>List of Members</h1>
      <table>
            <tr>
                <td class="tblloan" style="font-weight: bold;">Email</td>
                <td class="tblloan" style="font-weight: bold;">Program</td>
                <td class="tblloan" style="font-weight: bold;">Year</td>
            </tr> 
            <c:forEach var="mem" items="${members}">
                <tr>
                    <td class="tblloan">${mem.emailAddress}</td>
                    <td class="tblloan">${mem.programName}</td>
                    <td class="tblloan">${mem.yearLevel}</td>
                    <td class="tblloan">
                        <!-- Avoiding line wrap as best we could -->
    <a href="KHSBMemberAdmin?email=${mem.emailAddress}&amp;action=update">Update</a>
                    </td>
                    <td class="tblloan">
                        <!-- Avoiding line wrap as best we could -->
<a href="KHSBMemberAdmin?email=${mem.emailAddress}&amp;action=confirmDeleteMember">Delete</a>
                    </td>
                </tr>
            </c:forEach>
                    
                        
                    
      </table>
      <br/>
      <form action="KHSBMemberAdmin?action=addMember" method="post">
          <button  id="button" type="submit">Add Member</button>
      </form><br/>
      
      
  </section>
  
  
  <jsp:include page="KHSBFooter.jsp" />