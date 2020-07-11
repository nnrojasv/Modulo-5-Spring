<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>    
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>  
   
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Listas de chequeo</title>
</head>
<body>

<h1>Listas de chequeo</h1>  
<table >  
	<tr>
		<th>Id</th><th>Detalle</th><th>Estado</th><th>Is visita</th><th>Editar</th><th>Eliminar</th>
	</tr>  
   <c:forEach var="ch" items="${listch}">   
   <tr>  
	   <td>${c.idchequeo}</td>  
	   <td>${ch.detalle}</td>  
	   <td>${ch.estado}</td>  
	   <td>${ch.visitas_idvisita}</td>
	   
	   <td><a href="editch/${ch.idchequeo}">Editar</a></td>  
	   <td><a href="deletech/${ch.idchequeo}">Eliminar</a></td>
	     
   </tr>
   </c:forEach>  
   </table>  
   <br/>  
   <a href="chform">Agregar nueva Lista de chequeo</a> 

</body>
</html>