<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>    
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>  
   
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Lista de Capacitaciones</title>
</head>
<body>

<h1>Lista de Capacitaciones</h1>  
<table >  
	<tr>
		<th>Id</th><th>Fecha</th><th>Hora</th><th>Numero de asistentes</th><th>Id Visita</th><th>Editar</th><th>Eliminar</th>
	</tr>  
   <c:forEach var="cap" items="${listcap}">   
   <tr>  
	   <td>${cap.idcapacitacion}</td>  
	   <td>${cap.fecha}</td>  
	   <td>${cap.hora}</td>  
	   <td>${cap.numasistentes}</td>
	   <td>${cap.visitas_idvisita}</td>  
	
	   <td><a href="editcap/${cap.idcapacitacion}">Editar</a></td>  
	   <td><a href="deletecap/${cap.idcapacitacion}">Eliminar</a></td>
	     
   </tr>
   </c:forEach>  
   </table>  
   <br/>  
   <a href="capform">Agregar nueva Capacitacion</a> 

</body>
</html>