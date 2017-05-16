<%--
FileName: KHSBError.jsp
Purpose: Custom Error page
Revision History
         Khaleel Hamid & Steve Bulgin, 2015.02.24: Created
         Steven Bulgin, 2015.03.02: Switch HTML comment tags to JSP tags in the
         file header.
--%>



<jsp:include page="KHSBBanner.jsp" />
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<h1 style="font-weight: bold;">Java Error</h1>
<p>Sorry, Java has thrown an exception.</p>
<p>To continue, click the Back button.</p> <br>

<h2 style="font-weight: bold;">Details</h2>
<p>Type: <c:out value="${pageContext.exception['class']}"/></p>
<p>Message: <c:out value="${pageContext.exception.message}"/></p>


<jsp:include page="KHSBFooter.jsp" />
