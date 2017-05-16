<%--
FileName: KHSBindex.jsp
Purpose: "Home" page. Includes KHSBBanner.jsp and
         KHSBFooter.jsp
Revision History
         Khaleel Hamid & Steve Bulgin, 2015.01.16: Created
         Steven Bulgin, 2015.03.02: Switch HTML comment tags to JSP tags in the
         file header.
--%>

<jsp:include page="KHSBBanner.jsp" />

    <section>
        <h2>Java Web Technologies: Section 2</h2>
        <p>Pair Programming Team:</p>
        <h2>Assignment 2</h2>
        <h2>Driver: Khaleel Hamid</h2>
        <h2>Copilot: Steve Bulgin</h2>
        <p>Current Date &AMP; Time</p>
        <h2> <% java.util.Date date = new java.util.Date();
                out.println( String.valueOf(date)); %> </h2> 
              
    </section>        
<jsp:include page="KHSBFooter.jsp" />
    
