<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>    
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>  
   
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Lista de empleados</title>
</head>
<body>

<h1>Lista de empleados</h1>  
<table >  
	<tr>
		<th>Id</th><th>Nombre</th><th>Especialidad</th><th>Editar</th><th>Eliminar</th>
	</tr>  
   <c:forEach var="emp" items="${listemp}">   
   <tr>  
	   <td>${emp.idempleado}</td>  
	   <td>${emp.nombre}</td>  
	   <td>${emp.especialidad}</td>  
	   <td><a href="editemp/${emp.idempleado}">Editar</a></td>  
	   <td><a href="deleteemp/${emp.idempleado}">Eliminar</a></td>  
   </tr>
   </c:forEach>  
   </table>  
   <br/>  
   <a href="empform">Agregar nuevo empleado</a> 

</body>
</html>