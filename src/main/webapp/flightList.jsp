<%@ page import="com.flyaway.entity.Flights" %>
<%@ page import="java.util.List" %>
<%@ page import="java.util.Iterator" %><%--
  Created by IntelliJ IDEA.
  User: user
  Date: 3.03.2023
  Time: 20:01
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Flight List</title>
</head>
<body>
<h4 style="color:rgba(0,128,0,0.66);">Available Flights:</h4>
<%
    Object obj = request.getAttribute("listOfFlights");
    List<Flights> ll = (List)obj;
    Iterator<Flights> li = ll.iterator();
    while(li.hasNext()){
        Flights u = li.next();
%>
<div>
    <span>
   <span style="font-weight: bold"> Flight Name:</span> <%=u.getFlightName() %>
    <br/><span style="font-weight: bold"> Date Of Flight:</span> <%=u.getDateOfFlight() %>
    <br/><span style="font-weight: bold"> Flight Price:</span> <%=u.getPrice() %>
    <br/><span style="font-weight: bold"> Available Seats:</span> <%=u.getSeats() %>
        <br>
        <br/>
    </span>
</div>
<%
    }
%>
</body>
</html>
