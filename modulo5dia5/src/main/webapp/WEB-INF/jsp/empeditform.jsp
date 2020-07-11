<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>    
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>  
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<h1>Editar Empleado</h1>
       <form:form method="post" action="/modulo5dia5/editsaveemp">    
        <table >    
        <tr>  
        <td></td>    
         <td><form:hidden path="idempleado" /></td>  
         </tr>   
         <tr>    
          <td>Nombre : </td>   
          <td><form:input path="nombre"  /></td>  
         </tr>    
         <tr>    
          <td>Especialidad:</td>    
          <td><form:input path="especialidad" /></td>  
         </tr>   
         
           
         <tr>    
          <td> </td>    
          <td><input type="submit" value="Editar y Guardar" /></td>    
         </tr>
        </table>
       </form:form>   


</body>
</html>