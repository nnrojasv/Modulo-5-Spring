    
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
       <form:form method="post" action="saveemp">    
        <table >    
         <tr>    
          <td>Nombre : </td>   
          <td><form:input path="nombre"  /></td>  
         </tr>    
         <tr>    
          <td>Especialidad :</td>    
          <td><form:input path="especialidad" /></td>  
         </tr>   
         <tr>
          <td> </td>    
          <td><input type="submit" value="Agregar" /></td>    
         </tr>    
        </table>    
       </form:form>   

</body>
</html>