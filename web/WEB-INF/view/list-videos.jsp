<%-- 
    Document   : list-videos
    Created on : 24 Sep, 2017, 11:38:05 AM
    Author     : Indu
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link type="text/css" rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/style.css" />
        
    </head>
    <body>
        <header>
            <h1>Video Player</h1>
        </header>
        <section>
            <video controls="controls" width="100%" height="80%">
                <source src="${pageContext.request.contextPath}/resources/videos/sanskriti.mp4"/>
            </video>
        </section>
        <nav>
            <ul>
                <c:forEach var="tempVideo" items="${videos}">
                    <c:url var="playVideo" value="/player/playVideo">
                        <c:param name="videoId" value="${tempVideo.id}"/>
                    </c:url>
                    <li>
                        <a href="${playVideo}">
                            <img src="${pageContext.request.contextPath}/resources/images/${tempVideo.name}.png" width="25%" height="15%"/>
                        </a>
                    </li>
                </c:forEach>
            </ul> 
        </nav>
        
    </body>
</html>
