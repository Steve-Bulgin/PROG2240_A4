<%--
FileName: KHSBRegister.jsp
Purpose: Has form for registering. Includes KHSBBanner.jsp and
         KHSBFooter.jsp
Revision History
         Khaleel Hamid & Steve Bulgin, 2015.01.16: Created
         Steven Bulgin, 2015.03.02: Switch HTML comment tags to JSP tags in the
         file header.
--%>

<jsp:include page="KHSBBanner.jsp" />
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<section>
    <h2>New member registration form</h2>
    <br/>
    
    ${errMsg}
    <br/>
    <form action="/KHSBClub/KHSBMemberAdmin?action=updateMember" method="post">
        <input type="hidden" name="action" value="add">
        <label for="fullname">Full Name:</label>
        <input type="text" name="fullname" value="${name}"/><br/>
        <label for="email">Email:</label>
        <input type="email" name="email" value="${email}"/><br/>
        <label for="phone">Phone:</label>
        <input type="tel" name="phone" value="${phone}"/><br/>
        <label for="program">Program:</label>
        <select id="reg" name="program" value="${program}" required/>
            <option value="${program}" selected disabled hidden>${program}</option>
            <option value="CPA">CPA</option>
            <option value="CP">CP</option>
            <option value="ITID">ITID</option>
            <option value="CAD">CAD</option>
            <option value="ITSS">ITSS</option>
        </select><br/>
        <label for="year">Year:</label>
        <select id="reg"  name="year" required>
            <option value="${year}" selected disabled hidden>${year}</option>
            <option value="1">1</option>
            <option value="2">2</option>
            <option value="3">3</option>
            <option value="4">4</option>
        </select><br/>
        <input id="button" type="submit" value="Update Member">
        <input id="button" type="reset" value="Reset"> 
    </form>
</section>
<jsp:include page="KHSBFooter.jsp" />
