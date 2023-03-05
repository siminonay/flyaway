<%@ page import="java.util.List" %>
<%@ page import="java.util.Iterator" %>
<%@ page import="com.flyaway.entity.Flights" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Search Flight</title>
</head>
<body>
<h4 style="color:rgba(0,128,0,0.66);">Search Flights:</h4>
    <form name="f1" action="SearchFlightController" method="GET">
        <span style="font-weight: bold"> Destination:</span>
        <input type="text" name="destination">
       <input type="submit" name="submit" value="Search"/>
        <br/><span style="font-weight: bold"> Source:</span>
        <input type="text" style="margin-left: 30px; margin-top: 10px" name="source">
        <input type="submit" name="submit" value="Search"/>
    </form>

<%
    Object obj = request.getAttribute("listOfFlights");
    if(obj != null){
    List<Flights> lp = (List)obj;
    Iterator<Flights> li = lp.iterator();
    while(li.hasNext()){
        Flights f = li.next();
%>
<h4 style="color:rgba(0,128,0,0.66);">Available Flights:</h4>

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
    }}

    Object obj2 = request.getAttribute("flightsListEmpty");
    if(obj2 != null) {

%>
<div>
<span style="font-weight: bold; color:red"> There Is No Flight!</span>
</div>
<%
    }
%>

</body>
</html>
