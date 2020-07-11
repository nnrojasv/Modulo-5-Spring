<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>    
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>   

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Editar datos Visita</title>
</head>
<body>

        <h1>Editar Visita</h1>
       <form:form method="post" action="/modulo5dia5/editsavevis">    
        <table >    
        <tr>  
        <td></td>    
         <td><form:hidden path="idvisita" /></td>  
         </tr>   
         <tr>    
          <td>Direccion : </td>   
          <td><form:input path="direccion"  /></td>  
         </tr>    
         <tr>    
          <td>Ciudad :</td>    
          <td><form:input path="ciudad" /></td>  
         </tr>   
         <tr>    
          <td>Fecha :</td>    
          <td><form:input path="fecha" /></td>  
         </tr>   
         <tr>    
          <td>Resumen : </td>   
          <td><form:input path="resumen"  /></td>  
         </tr>    
         <tr>    
          <td>Observaciones : </td>   
          <td><form:input path="observaciones"  /></td>  
         </tr>    
          <tr>    
          <td>Cliente Id : </td>   
          <td><form:input path="cliente_id"  /></td>  
         </tr> 
          <tr>    
          <td>Encargado : </td>   
          <td><form:input path="empleado_idempleado"  /></td>  
         </tr>   
         <tr>    
          <td> </td>    
          <td><input type="submit" value="Editar y Guardar" /></td>    
         </tr>
        </table>
       </form:form>   


</body>
</html>