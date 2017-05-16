<%--
FileName: KHSBDisplayMember.jsp
Purpose: Results page. Shows parameters grabbed from register form. Includes 
         KHSBBanner.jsp and KHSBFooter.jsp
Revision History
         Khaleel Hamid & Steve Bulgin, 2015.01.16: Created
         Steven Bulgin, 2015.03.02: Switch HTML comment tags to JSP tags in the
         file header.
--%>

<jsp:include page="KHSBBanner.jsp" />

  <section>
      <h1 id="resulth1">Thanks for joining our club!</h1>
      <p>Here's the information you entered:</p><br/>
      <h2>Full Name:</h2>      
      <p><span> ${param.fullname}</span></p>
      <h2>Email:</h2>
      <p><span>${param.email}</span></p>
      <h2>Phone:</h2>
      <p><span>${param.phone}</span></p>
      <h2>Program:</h2>
      <p><span>${param.program}</span></p>
      <h2>Year:</h2>
      <p><span>${param.year}</span></p><br/>
      <p>To register another member, click on the back button in your browser or<br/>
      click the Return button below</p><br/>
      
      <form action="/KHSBClub/KHSBRegister.jsp">
          <button  id="button" type="submit">Return</button>
      </form><br/>
      
      
  </section>
  
  
  <jsp:include page="KHSBFooter.jsp" />
