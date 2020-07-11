<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>    
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>  
   
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Lista de Visitas</title>
</head>
<body>

<h1>Lista de Visitas</h1>  
<table >  

	<tr>
		<th>Id</th><th>Direccion</th><th>Ciudad</th><th>Fecha</th><th>Resumen</th><th>Observaciones</th><th>Cliente Id</th><th>Encargado</th><th>Editar</th><th>Eliminar</th>
	</tr>  
   <c:forEach var="vis" items="${listvis}">   
   <tr>  
	   <td>${vis.idvisita}</td>  
	   <td>${vis.direccion}</td>  
	   <td>${vis.ciudad}</td>  
	   <td>${vis.fecha}</td>
	   <td>${vis.resumen}</td>  
	   <td>${vis.observaciones}</td> 
	   <td>${vis.cliente_id}</td>  
	   <td>${vis.empleado_idempleado}</td>  
	   <td><a href="editvis/${vis.idvisita}">Editar</a></td>  
	   <td><a href="deletevis/${vis.idvisita}">Eliminar</a></td>  
   </tr>
   </c:forEach>  
   </table>  
   <br/>  
   <a href="visform">Agregar nueva visita</a> 

</body>
</html>