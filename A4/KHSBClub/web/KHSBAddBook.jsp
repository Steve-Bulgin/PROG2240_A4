<%--
FileName: KHSBAddBook.jsp
Purpose: Form for adding a book to the book.txt file. Includes KHSBBanner.jsp 
         and KHSBFooter.jsp
Revision History
         Khaleel Hamid & Steve Bulgin, 2015.02.20: Created
         Steven Bulgin, 2015.03.02: Switch HTML comment tags to JSP tags in the
         file header.
--%>

<jsp:include page="KHSBBanner.jsp" />
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

        <h1>Add a Book</h1>
        ${errorMsg}
        <form id="postform" action="KHSBAddBook" method="post">
            <label>Code: </label>
            <input type="text" name="code" value="${book.code}"/><br/>
            <label>Description: </label>
            <input type="text" name="description" value="${book.description}"/>
            <br/>
            <label>Quantity: </label>
            <input type="text" name="quantity" value="${quantity}"/><br/>
            
            <input type="submit" value="Save">
        </form>
        <form id="cancelform" action="KHSBDisplayBooks">
            <input type="submit" value="Cancel">
        </form>
<jsp:include page="KHSBFooter.jsp" />
