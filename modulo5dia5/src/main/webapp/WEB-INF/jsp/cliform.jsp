    
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>    
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>   
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Agregar nuevo Cliente</title>
</head>
<body>

        <h1>Agregar nuevo Cliente</h1>  
       <form:form method="post" action="save">    
        <table >    
         <tr>    
          <td>Nombre : </td>   
          <td><form:input path="nombre"  /></td>  
         </tr>    
         <tr>    
          <td>Teléfono :</td>    
          <td><form:input path="telefono" /></td>  
         </tr>   
         <tr>    
          <td>Correo electrónico :</td>    
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
          <td><input type="submit" value="Agregar" /></td>    
         </tr>    
        </table>    
       </form:form>   

</body>
</html>