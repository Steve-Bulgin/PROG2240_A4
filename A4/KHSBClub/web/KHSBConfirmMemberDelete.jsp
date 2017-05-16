<%--
FileName: KHSBConfirmMemberDelete.jsp
Purpose: Results page. Shows parameters grabbed from register form. Includes 
         KHSBBanner.jsp and KHSBFooter.jsp
Revision History
         Khaleel Hamid & Steve Bulgin, 2015.04.04: Created
--%>

<jsp:include page="KHSBBanner.jsp" />

  <section>
      <H1>You are about to delete a member.</H1>
      <h1>Are you sure?</h1>
      
      <form id="postform" action="KHSBMemberAdmin" method="post">
          <input type="hidden" name="action" value="yes">
          <input type="hidden" name="email" value="${email}">
          <input id="button" type="submit" value="Yes">
      </form>
      <form id="cancelform" action="KHSBDisplayMembers.jsp" method="post">
          <input id="button" type="submit" value="No">
      </form>
  </section>
  
  
<jsp:include page="KHSBFooter.jsp" />