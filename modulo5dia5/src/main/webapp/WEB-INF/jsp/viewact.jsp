<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>    
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>  
   
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Lista de Accidentes</title>
</head>
<body>

<h1>Lista de Actividades </h1>  

<c:forEach var="act" items="${listact}"> 

   	<table >  
   	<h2> Lista de visitas</h2>
	<tr>
		<th>Id</th><th>Direccion</th><th>Ciudad</th><th>Fecha</th><th>Resumen</th><th>Observaciones</th><th>Cliente Id</th><th>Encargado</th>
	</tr>  
   <c:forEach var="vis" items="${act.getVisitas()}">   
   <tr>  
	   <td>${vis.idvisita}</td>  
	   <td>${vis.direccion}</td>  
	   <td>${vis.ciudad}</td>  
	   <td>${vis.fecha}</td>
	   <td>${vis.resumen}</td>  
	   <td>${vis.observaciones}</td> 
	   <td>${vis.cliente_id}</td>  
	   <td>${vis.empleado_idempleado}</td>  
	  
   </tr>
   </c:forEach>  
   </table>  
   
   <table >  
   <h2> Lista de chequeos</h2>
	<tr>
		<th>Id</th><th>Detalle</th><th>Estado</th><th>Is visita</th>
	</tr>  
   <c:forEach var="ch" items="${act.getchecklist()}">   
   <tr>  
	   <td>${c.idchequeo}</td>  
	   <td>${ch.detalle}</td>  
	   <td>${ch.estado}</td>  
	   <td>${ch.visitas_idvisita}</td>	     
   </tr>
   </c:forEach>  
   </table> 
   
   <h2>Lista de Capacitaciones</h2>  
<table >  
	<tr>
		<th>Id</th><th>Fecha</th><th>Hora</th><th>Numero de asistentes</th><th>Id Visita</th>
	</tr>  
   <c:forEach var="cap" items="${listcap}">   
   <tr>  
	   <td>${cap.idcapacitacion}</td>  
	   <td>${cap.fecha}</td>  
	   <td>${cap.hora}</td>  
	   <td>${cap.numasistentes}</td>
	   <td>${cap.visitas_idvisita}</td>  
	
	   
	     
   </tr>
   </c:forEach>  
   </table>
   
   <h2>Lista de asesorias</h2>
	<table >
		<tr>
			<th>Id Visita</th>
			<th>Id Asesoria</th>
			<th>Detalle</th>
			<th>Gestion</th>
			<th>Propuestas</th>
			<th>Fecha</th>
			<th>Es especial</th>
		
		</tr>
		<c:forEach var="as" items="${listas}">
			<tr>
				<td>${as.visitas_idvisita}</td>
				<td>${as.idasesoria}</td>
				<td>${as.detalle}</td>
				<td>${as.gestion}</td>
				<td>${as.propuestas}</td>
				<td>${as.fecha}</td>
				<td>${as.especial}</td>
				
			</tr>
		</c:forEach>
	</table>
	  
	   
   		
  </c:forEach>     
	   

 
 
   <br/>  
   <a href="/modulo5dia5/viewcli">Volver</a> 

</body>
</html>