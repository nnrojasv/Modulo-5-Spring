<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>    
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>   

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Editar datos cliente</title>
</head>
<body>

        <h1>Editar Cliente</h1>
       <form:form method="post" action="/modulo5dia5/editsave">    
        <table >    
        <tr>  
        <td></td>    
         <td><form:hidden path="id" /></td>  
         </tr>   
         <tr>    
          <td>Nombre : </td>   
          <td><form:input path="nombre"  /></td>  
         </tr>    
         <tr>    
          <td>Telefono :</td>    
          <td><form:input path="telefono" /></td>  
         </tr>   
         <tr>    
          <td>Correo Electrónico :</td>    
          <td><form:input path="correoelectronico" /></td>  
         </tr>   
         <tr>    
          <td>Rubro : </td>   
          <td><form:input path="rubro"  /></td>  
         </tr>    
         <tr>    
          <td>Dirección : </td>   
          <td><form:input path="direccion"  /></td>  
         </tr>    
           
         <tr>    
          <td> </td>    
          <td><input type="submit" value="Editar y Guardar" /></td>    
         </tr>
        </table>
       </form:form>   


</body>
</html>