<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>    
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>  
   
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Morosidad</title>
</head>
<body>

<h1>Clientes morosos</h1>  
<table >  
	<tr>
		<th>Nombre</th>
	</tr>  
   <c:forEach var="cli" items="${listmoro}">   
   <tr>  
	  
	   <td>${cli.nombre}</td>  
	    
	   
   </tr>
   </c:forEach>  
   </table>  
   <br/>  
  

</body>
</html>