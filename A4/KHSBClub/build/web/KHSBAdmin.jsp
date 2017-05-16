<%--
FileName: KHSBAdmin.jsp
Purpose: Unimplemented as yet. Just a placeholder. Includes KHSBBanner.jsp and
         KHSBFooter.jsp
Revision History
         Khaleel Hamid & Steve Bulgin, 2015.01.16: Created
         Khaleel Hamid & Steve Bulgin, 2015.02.20: Added link to 
         KHSBDisplayBooks.jsp
         Steven Bulgin, 2015.03.02: Switch HTML comment tags to JSP tags in the
         file header.
--%>


<jsp:include page="KHSBBanner.jsp" />

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

    <h1>Admin: Data Maintenance</h1>
    <br/>
    <a href="KHSBDisplayBooks">Maintain Books</a> <br>
    <a href="<c:url value='KHSBMemberAdmin'/>">Display Members</a>
<jsp:include page="KHSBFooter.jsp" />
