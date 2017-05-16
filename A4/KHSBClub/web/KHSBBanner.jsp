<!--
FileName: KHSBBanner.jsp
Purpose: Banner, includes the header navigation links
Revision History
         Khaleel Hamid & Steve Bulgin, 2015.01.16: Created
-->

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>KHSB Computer Programming Club</title>
        <link rel="shortcut icon" href="<c:url value='/images/kfc.jpg'/>">
        <link rel="stylesheet" href="<c:url value='/css/main.css'/>">
        

    </head>
    <body>
        <header>
            <a href="<c:url value='/KHSBIndex.jsp'/>">
                <img src="<c:url value='/images/computer-icon.png'/>" 
                     alt="KHSBLogo" height="96" width="96"></a>
            <h1>KHSB Computer Programming Club</h1>
            <h2>IT@Conestoga</h2>
        </header>
        <nav id= "nav_bar">
            <ul>
                <li><a href="<c:url value='/KHSBIndex.jsp'/>">Home</a></li>
                <li><a href="<c:url value='KHSBMemberAdmin?action=addMember'/>">
                        Register</a></li>
                <li><a href="<c:url value='KHSBELoan'/>">eLoan</a></li>
                <li><a href="<c:url value='KHSBECart.jsp'/>">eCart</a></li>
                <li><a href="<c:url value='/KHSBAdmin.jsp'/>">Admin</a></li>
            </ul>
            
                     
        </nav>
        
    
