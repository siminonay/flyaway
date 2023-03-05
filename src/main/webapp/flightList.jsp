<%@ page import="com.flyaway.entity.Flights" %>
<%@ page import="java.util.List" %>
<%@ page import="java.util.Iterator" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Flight List</title>
</head>
<body>
<h4 style="color:rgba(0,128,0,0.66);">Available Flights:</h4>
<%
    Object obj = request.getAttribute("listOfFlights");
    List<Flights> lf = (List)obj;
    Iterator<Flights> li = lf.iterator();
    while(li.hasNext()){
        Flights f = li.next();
%>
<div>
    <span>
   <span style="font-weight: bold"> Flight Name:</span> <%=f.getFlightName() %>
    <br/><span style="font-weight: bold"> Date Of Flight:</span> <%=f.getDateOfFlight() %>
    <br/><span style="font-weight: bold"> Flight Price:</span> <%=f.getPrice() %>
    <br/><span style="font-weight: bold"> Available Seats:</span> <%=f.getSeats() %>
        <br>
        <br/>
    </span>
</div>
<%
    }
%>
</body>
</html>
