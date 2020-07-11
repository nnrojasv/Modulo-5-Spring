<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>    
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>  
   
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Lista de clientes</title>
</head>
<body>

<h1>Lista de clientes</h1>  
<table >  
	<tr>
		<th>Id</th><th>Nombre</th><th>Teléfono</th><th>Correo Electrónico</th><th>Rubro</th><th>Dirección</th><th>Editar</th><th>Eliminar</th>
	</tr>  
   <c:forEach var="cli" items="${list}">   
   <tr>  
	   <td>${cli.id}</td>  
	   <td>${cli.nombre}</td>  
	   <td>${cli.telefono}</td>  
	   <td>${cli.correoelectronico}</td>
	   <td>${cli.rubro}</td>  
	   <td>${cli.direccion}</td>  
	   <td><a href="editcli/${cli.id}">Editar</a></td>  
	   <td><a href="deletecli/${cli.id}">Eliminar</a></td>
	    <td><a href="viewact/${cli.id}">Reporte</a></td>    
   </tr>
   </c:forEach>  
   </table>  
   <br/>  
   <a href="cliform">Agregar nuevo cliente</a> 

</body>
</html>