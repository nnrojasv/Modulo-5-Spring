
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>    
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>   
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Agregar nuevo Pago</title>
</head>
<body>

        <h1>Agregar nuevo Pago</h1>  
       <form:form method="post" action="savepago">    
        <table >    
         <tr>    
          <td>Mes año : </td>   
          <td><form:input path="mesanio"  /></td>  
         </tr>    
         <tr>    
          <td>Monto regular :</td>    
          <td><form:input path="montoregular" /></td>  
         </tr>   
         <tr>    
          <td>Monto adicionales :</td>    
          <td><form:input path="montoadicionales" /></td>  
         </tr>   
         <tr>    
          <td>Cliente id : </td>   
          <td><form:input path="cliente_id"  /></td>  
         </tr>    
         <tr>    
          <td> </td>    
          <td><input type="submit" value="Agregar pago" /></td>    
         </tr>    
        </table>    
       </form:form>   

</body>
</html>