package com.m5d5.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import java.util.List;



import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.m5d5.beans.Empleado;

public class EmpleadoDao {

JdbcTemplate template;
	
	public void setTemplate(JdbcTemplate template) {    
	    this.template = template;    
	}
	
	public int save(Empleado e){    
	    String sql="insert into Empleado (nombre,especialidad) values('"+e.getNombre()+"','"+e.getEspecialidad()+"')";
	    return template.update(sql);
	}
	
	public int update(Empleado e){    
	    String sql="update Empleado set nombre='"+e.getNombre()+"', especialidad='"+e.getEspecialidad()+"' where idempleado="+e.getIdempleado();
	    return template.update(sql);    
	}   
	
	public int delete(int id) /* throws SQLIntegrityConstraintViolationException */{   
		
		String sql="delete from Empleado where idempleado="+id;
		return template.update(sql);
	    
	}    

	public Empleado getEmpById(int id){    
	    String sql="select * from Empleado where idempleado=?";
	    return template.queryForObject(sql, new Object[]{id},new BeanPropertyRowMapper<Empleado>(Empleado.class));    
	}
	
	public List<Empleado> getEmpleados(){    
	    return template.query("select * from Empleado",new RowMapper<Empleado>(){    
	        public Empleado mapRow(ResultSet rs, int row) throws SQLException {    
	            Empleado e=new Empleado();    
	            e.setIdempleado(rs.getInt(1));    
	            e.setNombre(rs.getString(2));    
	            e.setEspecialidad(rs.getString(3));
	    
	            return e;
	        }    
	    });    
	}    	
	
	
}

