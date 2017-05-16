<%--
FileName: KHSBDisplaybooks.jsp
Purpose: Displays a list of books. Includes KHSBBanner.jsp and
         KHSBFooter.jsp
Revision History
         Khaleel Hamid & Steve Bulgin, 2015.02.20: Created
         Steven Bulgin, 2015.03.02: Switch HTML comment tags to JSP tags in the
         file header.
--%>

<jsp:include page="KHSBBanner.jsp" />

<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>


<h1>List of Books</h1>
<table>
    <tr>
        <td style="font-weight: bold;">Code</td>
        <td style="font-weight: bold;">Description</td>
        <td style="font-weight: bold;">Quantity</td>
    </tr>
    <c:forEach var="book" items="${books}">
        <tr>
            <td><c:out value="${book.code}"/></td>
            <td><c:out value="${book.description}"/></td>
            <td><c:out value="${book.quantity}"/></td>
        </tr>
        
    </c:forEach>
</table>
<br/>
<form action="KHSBAddBook.jsp">
    <input type="submit" value="Add Book"/>    
</form>
<jsp:include page="KHSBFooter.jsp" />
