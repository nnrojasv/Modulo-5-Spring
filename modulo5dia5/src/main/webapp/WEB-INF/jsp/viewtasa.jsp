<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>    
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>  
   
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Tasa de accidentabilidad</title>
</head>
<body>

<h1>Tasa de Accidentabilidad</h1>  
<table >  
	<tr>
		<th>Nombre</th><th>Accidentes año anterior</th>
	</tr>  
   <c:forEach var="cli" items="${listtasa}">   
   <tr>  
	  
	   <td>${cli.nombre}</td>  
	   <td>${cli.tasaacc}</td>  
	   
   </tr>
   </c:forEach>  
   </table>  
   <br/>  
  

</body>
</html>