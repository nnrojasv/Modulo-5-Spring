<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>    
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>  
   
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Lista de Mejoras</title>
</head>
<body>

<h1>Lista de Mejoras</h1>  
<table>  
	<tr>
		<th>Id</th><th>Fecha</th><th>Motivo</th><th>Actividades</th><th>Estado</th><th>Cliente Id</th><th>Editar</th><th>Eliminar</th>
	</tr>  
   <c:forEach var="mj" items="${listmj}">   
   <tr>  
	   <td>${mj.idmejora}</td>  
	   <td>${mj.fecha}</td>  
	   <td>${mj.motivo}</td>  
	   <td>${mj.actividades}</td>
	   <td>${mj.estado}</td>  
	   <td>${mj.cliente_id}</td>  
	   <td><a href="editmj/${mj.idmejora}">Editar</a></td>  
	   <td><a href="deletemj/${mj.idmejora}">Eliminar</a></td>  
   </tr>
   </c:forEach>  
   </table>  
   <br/>  
   <a href="mejform">Agregar nueva Mejora</a> 

</body>
</html>