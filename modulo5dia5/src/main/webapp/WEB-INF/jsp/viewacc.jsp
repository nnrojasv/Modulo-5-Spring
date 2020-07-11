<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>    
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>  
   
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Lista de Accidentes</title>
</head>
<body>

<h1>Lista de Accidentes</h1>  
<table >  
	<tr>
		<th>Id Accidente</th><th>Fecha</th><th>Hora</th><th>Suceso</th><th>Lugar</th><th>Cliente</th><th>Editar</th><th>Eliminar</th>
	</tr>  
   <c:forEach var="acc" items="${listacc}">   
   <tr>  
	   <td>${acc.idaccidente}</td>  
	   <td>${acc.fecha}</td>  
	   <td>${acc.hora}</td>  
	   <td>${acc.suceso}</td>
	   <td>${acc.lugar}</td>  
	   <td>${acc.cliente_id}</td>  
	   <td><a href="editacc/${acc.idaccidente}">Editar</a></td>  
	   <td><a href="deleteacc/${acc.idaccidente}">Eliminar</a></td>  
   </tr>
   </c:forEach>  
   </table>  
   <br/>  
   <a href="accform">Agregar Accidente</a> 

</body>
</html>