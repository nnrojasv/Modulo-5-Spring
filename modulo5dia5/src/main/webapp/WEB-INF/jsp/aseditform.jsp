<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Editar Asesoria</title>
</head>
<body>

	<h1>Editar Asesoria</h1>
	<form:form method="post" action="/modulo5dia5/editsaveas">
		<table>
			<tr>
				<td></td>
				<td><form:hidden path="idasesoria" /></td>
			</tr>
			<tr>
				<td>Id visita :</td>
				<td><form:input path="visitas_idvisita" /></td>
			</tr>
			<tr>
				<td>Detalle :</td>
				<td><form:input path="detalle" /></td>
			</tr>
			<tr>
				<td>Gestion :</td>
				<td><form:input path="gestion" /></td>
			</tr>
			<tr>
				<td>Propuestas :</td>
				<td><form:input path="propuestas" /></td>
			</tr>
			<tr>
				<td>Fecha :</td>
				<td><form:input path="fecha" /></td>
			</tr>
			<tr>
				<td>Es especial :</td>
				<td><form:input path="especial" /></td>
			</tr>

			<tr>
				<td></td>
				<td><input type="submit" value="Editar y Guardar" /></td>
			</tr>
		</table>
	</form:form>


</body>
</html>