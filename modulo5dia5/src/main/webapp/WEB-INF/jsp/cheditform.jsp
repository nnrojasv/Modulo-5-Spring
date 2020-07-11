<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>    
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>   

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Editar lista de chequeo</title>
</head>
<body>

        <h1>Editar lista de chequeo</h1>
       <form:form method="post" action="/modulo5dia5/editsavech">    
        <table >    
        <tr>  
        <td></td>    
         <td><form:hidden path="idchequeo" /></td>  
         </tr>   
         <tr>    
          <td>Detalle : </td>   
          <td><form:input path="detalle"  /></td>  
         </tr>    
         <tr>    
          <td>Estado :</td>    
          <td><form:input path="Estado" /></td>  
         </tr>   
         <tr>    
          <td>Id visita :</td>    
          <td><form:input path="visitas_idvisita" /></td>  
         </tr>   
              
         <tr>    
          <td> </td>    
          <td><input type="submit" value="Editar y Guardar" /></td>    
         </tr>
        </table>
       </form:form>   


</body>
</html>