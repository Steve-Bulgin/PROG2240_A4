<%--
FileName: KHSBELoan.jsp
Purpose: "Home" page. Includes KHSBBanner.jsp and
         KHSBFooter.jsp
Revision History
         Khaleel Hamid & Steve Bulgin, 2015.03.14: Created
--%>

<jsp:include page="KHSBBanner.jsp" />
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    <section>
       
        <table>
            <tr>
                <td class="tblloan" style="font-weight: bold;">Code</td>
                <td class="tblloan" style="font-weight: bold;">Description</td>
                <td class="tblloan" style="font-weight: bold;">QOH</td>
                <td class="tblloan" style="font-weight: bold;">Action</td>
            </tr>
            <c:forEach var="li" items="${applicationScope.loanitems}">
            <tr>
                <td class="tblloan"><c:out value="${li.code}"/></td>
                <td class="tblloan"><c:out value="${li.description}"/></td>
                <td class="tblloan"><c:out value="${li.quantity}"/></td>
                <c:choose>
                    <c:when test="${li.quantity != 0}">
                        <td class="tblloan"><a href="KHSBCart?action=reserve&amp;code=${li.code}">Reserve</a></td>
                    </c:when>
                    <c:otherwise>
                        <td class="tblloan" style="color: grey; text-align:right">N/A</td>                            
                    </c:otherwise>
                </c:choose>                
            </tr>
        
            </c:forEach>
        </table>
    
    </section>
    
 <jsp:include page="KHSBFooter.jsp" />