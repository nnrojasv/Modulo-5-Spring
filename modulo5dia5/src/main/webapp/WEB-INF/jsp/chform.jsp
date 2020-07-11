    
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>    
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>   
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Agregar nueva Lista de chequeo</title>
</head>
<body>

        <h1>Agregar nueva Lista de chequeo</h1>  
       <form:form method="post" action="savech">    
        <table >    
         <tr>    
          <td>Detalle : </td>   
          <td><form:input path="detalle"  /></td>  
         </tr>    
         <tr>    
          <td>Estado :</td>    
          <td><form:input path="estado" /></td>  
         </tr>   
         <tr>    
          <td>Id Visita :</td>    
          <td><form:input path="visitas_idvisita" /></td>  
         </tr>   
            
         <tr>    
          <td> </td>    
          <td><input type="submit" value="Agregar" /></td>    
         </tr>    
        </table>    
       </form:form>   

</body>
</html>