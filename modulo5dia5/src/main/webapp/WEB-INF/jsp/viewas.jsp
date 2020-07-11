<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Lista de clientes</title>
</head>
<body>

	<h1>Lista de asesorias</h1>
	<table >
		<tr>
			<th>Id Visita</th>
			<th>Id Asesoria</th>
			<th>Detalle</th>
			<th>Gestion</th>
			<th>Propuestas</th>
			<th>Fecha</th>
			<th>Es especial</th>
			<th>Editar</th>
			<th>Eliminar</th>
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
				<td><a href="editas/${as.idasesoria}">Editar</a></td>
				<td><a href="deleteas/${as.idasesoria}">Eliminar</a></td>
			</tr>
		</c:forEach>
	</table>
	<br />
	<a href="asform">Agregar nueva Asesoria</a>

</body>
</html>