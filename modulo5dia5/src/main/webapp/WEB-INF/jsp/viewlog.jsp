<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>    
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>  
   
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Bitacora de sistema</title>
</head>
<body>
<h1>Bitacora de sistema</h1>  
<table >  
	<tr>
		<th>Tipo </th><th>Clase </th><th>Fecha</th><th>Mensaje</th>
	</tr>  
   <c:forEach var="log" items="${list}">   
   <tr>  
	   <td>${log.tipo}</td>  
	   <td>${log.clase}</td>  
	   <td>${log.fecha}</td>  
	   <td>${log.mensaje}</td>
	    
   </tr>
   </c:forEach>  
   </table>  
</body>
</html>