

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%
      request.setAttribute("request_name", "rohit Wankhade");
     // out.println(request.getAttribute("request_name"));
       %>
       
       // using EL
       <h3> Hello : ${requestScope.request_name}</h3>
       
       
       
       <%
       session.setAttribute("session_cname", "RW company");
       //out.println(session.getAttribute("session_cname"));
       
       %>
       
       <h3> My Company Name is : ${session_cname}</h3>
       
       ${15+15}
    </body>
</html>
