<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>    
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>   

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Editar datos capacitacion</title>
</head>
<body>

        <h1>Editar Capacitacion</h1>
       <form:form method="post" action="/modulo5dia5/editsavecap">    
        <table >    
        <tr>  
        <td></td>    
         <td><form:hidden path="idcapacitacion" /></td>  
         </tr>   
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
          <td>Id visita : </td>   
          <td><form:input path="visitas_isvisita"  /></td>  
         </tr>        
         <tr>    
          <td> </td>    
          <td><input type="submit" value="Editar y Guardar" /></td>    
         </tr>
        </table>
       </form:form>   


</body>
</html>