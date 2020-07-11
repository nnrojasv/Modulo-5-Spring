    
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>    
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>   
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Agregar nueva Capacitacion</title>
</head>
<body>

        <h1>Agregar nueva Capacitacion</h1>  
       <form:form method="post" action="savecap">    
        <table >    
         <tr>    
          <td>Fecha : </td>   
          <td><form:input path="fecha"  /></td>  
         </tr>    
         <tr>    
          <td>Hora :</td>    
          <td><form:input path="hora" /></td>  
         </tr>   
         <tr>    
          <td>Numero de asistentes :</td>    
          <td><form:input path="numasistentes" /></td>  
         </tr>   
         <tr>    
          <td>Id Visita : </td>   
          <td><form:input path="visitas_idvisita"  /></td>  
         </tr>    
         <tr>    
          <td> </td>    
          <td><input type="submit" value="Agregar" /></td>    
         </tr>    
        </table>    
       </form:form>   

</body>
</html>