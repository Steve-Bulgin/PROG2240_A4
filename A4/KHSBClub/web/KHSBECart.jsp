<%--
FileName: KHSBECart.jsp
Purpose: "Home" page. Includes KHSBBanner.jsp and
         KHSBFooter.jsp
Revision History
         Khaleel Hamid & Steve Bulgin, 2015.03.14: Created
--%>

<jsp:include page="KHSBBanner.jsp" />
    
    <section>
     <table>
  <tr>
    <th class="tblloan">Code</th>
    <th class="tblloan">Description</th>
    <th class="tblloan">Quantity</th>
    
  </tr>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<h2>Your Loan Cart</h2>
<c:forEach var="item" items="${sessionScope.cart.items}">
  <tr>
    <td class="tblloan"><c:out value="${item.code}"/></td>
    <td class="tblloan"><c:out value="${item.description}"/></td>
    <td class="tblloan" style="text-align:right"><c:out value="${item.quantity}"/></td>
    <c:set var="total" value="${total + item.quantity}"/>
  </tr>
</c:forEach>
  <tr>
      <td class="tblloan"></td>
      <td class="tblloan" style="text-align:right">Total: </td>
      <c:choose>
        <c:when test="${empty total}">
            <td class="tblloan" style="text-align:right">0</td>
        </c:when>
        <c:otherwise>
            <td class="tblloan" style="text-align:right"><c:out value="${total}"/></td>                          
        </c:otherwise>
    </c:choose>
      
  </tr>
</table>
<p></p>
<a href="<c:url value='KHSBClearCart'/>">Clear the Cart</a><br/>
<a href="<c:url value='KHSBELoan'/>">Return to eLoan</a>
    
    </section>
    
 <jsp:include page="KHSBFooter.jsp" />
