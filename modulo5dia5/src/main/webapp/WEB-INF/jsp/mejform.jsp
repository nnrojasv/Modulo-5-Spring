    
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>    
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>   
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Agregar nueva mejora</title>
</head>
<body>

        <h1>Agregar nueva mejora</h1>  
       <form:form method="post" action="savemj">    
        <table >    
         <tr>    
          <td>Fecha : </td>   
          <td><form:input path="fecha"  /></td>  
         </tr>    
         <tr>    
          <td>Motivo :</td>    
          <td><form:input path="motivo" /></td>  
         </tr>   
         <tr>    
          <td>Actividades :</td>    
          <td><form:input path="actividades" /></td>  
         </tr>   
         <tr>    
          <td>Estado : </td>   
          <td><form:input path="estado"  /></td>  
         </tr>    
         <tr>    
          <td>Cliente : </td>   
          <td><form:input path="cliente_id"  /></td>  
         </tr>    
         <tr>    
          <td> </td>    
          <td><input type="submit" value="Agregar" /></td>    
         </tr>    
        </table>    
       </form:form>   

</body>
</html>