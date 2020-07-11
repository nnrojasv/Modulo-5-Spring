package com.m5d5.dao;

import java.sql.ResultSet;    
import java.sql.SQLException;    
import java.util.List;    
import org.springframework.jdbc.core.BeanPropertyRowMapper;    
import org.springframework.jdbc.core.JdbcTemplate;    
import org.springframework.jdbc.core.RowMapper;

import com.m5d5.beans.Cliente;    

public class ClienteDao {

	JdbcTemplate template;
	
	public void setTemplate(JdbcTemplate template) {    
	    this.template = template;    
	}
	
	public int save(Cliente c){    
	    String sql="insert into Cliente (nombre,telefono,correoelectronico,rubro,direccion) values('"+c.getNombre()+"',"+c.getTelefono()+",'"+c.getCorreoelectronico()+"','"+c.getRubro()+"','"+c.getDireccion()+"')";
	    return template.update(sql);
	}
	
	public int update(Cliente c){    
	    String sql="update Cliente set nombre='"+c.getNombre()+"', telefono="+c.getTelefono()+",correoelectronico='"+c.getCorreoelectronico()+"', rubro='"+c.getRubro()+"', direccion='"+c.getDireccion()+"' where id="+c.getId()+"";
	    return template.update(sql);    
	}   
	
	public int delete(int id){    
	    String sql="delete from Cliente where id="+id+"";
	    return template.update(sql);
	}    

	public Cliente getCliById(int id){    
	    String sql="select * from Cliente where id=?";
	    return template.queryForObject(sql, new Object[]{id},new BeanPropertyRowMapper<Cliente>(Cliente.class));    
	}
	
	public List<Cliente> getClientes(){    
	    return template.query("select * from Cliente",new RowMapper<Cliente>(){    
	        public Cliente mapRow(ResultSet rs, int row) throws SQLException {    
	            Cliente c=new Cliente();    
	            c.setId(rs.getInt(1));    
	            c.setNombre(rs.getString(2));    
	            c.setTelefono(rs.getInt(3));
	            c.setCorreoelectronico(rs.getString(4));
	            c.setRubro(rs.getString(5));
	            c.setDireccion(rs.getString(6));
	            return c;
	        }    
	    });    
	} 
	
	public List<Cliente> tasaAcc() {
		 return template.query("select count(*) \"Accidentabiidad\" , cliente.nombre from cliente join accidentes on accidentes.cliente_id = cliente.id where fecha like '%2019' group by cliente.nombre\r\n" + 
		 		"",new RowMapper<Cliente>(){    
		        public Cliente mapRow(ResultSet rs, int row) throws SQLException {    
		            Cliente cli=new Cliente();
		            cli.setTasaacc(rs.getInt(1));   
		            cli.setNombre(rs.getString(2));    
		            
		            return cli;
		        }    
		    }); 
	}
	
	public List<Cliente> morosidad() {
		 return template.query("Select cliente.nombre from cliente\r\n" + 
		 		"left join pagos on pagos.cliente_id= cliente.id\r\n" + 
		 		"where pagos.mesanio not like (Select to_char(sysdate, 'MM-YYYY') from dual)",new RowMapper<Cliente>(){    
		        public Cliente mapRow(ResultSet rs, int row) throws SQLException {    
		            Cliente cli=new Cliente();
		             
		            cli.setNombre(rs.getString(1));    
		            
		            return cli;
		        }    
		    }); 
	}
	
	
}
