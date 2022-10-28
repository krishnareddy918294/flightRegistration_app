<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %> 
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>DISPLAY FLIGHTS</title>
</head>
<body>

<h2>FLIGHT SEARCH RESULTS</h2>
<table border="1">
<tr>
 <th>flight number</th>
  <th>Airlines</th>
<th>Departure city</th>
<th>Arrival city</th>
<th>select flights</th>

  </tr>
<c:forEach var="findflights" items="${findflights}">

           <tr>
    
				
				<td>${findflights.flightnumber}</td>
				<td>${findflights.operatingairlineS}</td>
				<td>${findflights.departurecity}</td>
				<td>${findflights.arrivalcity}</td>
				<td>${findflights.estimateDepartureTime}</td>
            </tr>
    
     </c:forEach>
     </table>
</body>
</html>