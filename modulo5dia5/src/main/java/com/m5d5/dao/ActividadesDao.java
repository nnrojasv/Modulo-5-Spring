package com.m5d5.dao;


import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.m5d5.beans.Accidente;


public class ActividadesDao {

		JdbcTemplate template;
		
		public void setTemplate(JdbcTemplate template) {    
		    this.template = template;    
		}
		
		public int save(Accidente acc){    
		    String sql="insert into Accidente (fecha,hora,suceso,lugar,idcliente) values('"+acc.getFecha()+"',"+acc.getHora()+",'"+acc.getSuceso()+"','"+acc.getLugar()+"','"+acc.getcliente_id()+"')";
		    return template.update(sql);
		}
		
		public int update(Accidente acc){    
		    String sql="update Accidente set fecha='"+acc.getFecha()+"', hora="+acc.getHora()+",suceso='"+acc.getSuceso()+"', lugar='"+acc.getLugar()+"' where id="+acc.getcliente_id()+"";
		    return template.update(sql);    
		}   
		
		public int delete(int id){    
		    String sql="delete from Cliente where id="+id+"";
		    return template.update(sql);
		}    

		public Accidente getCliById(int id){    
		    String sql="select * from Cliente where idcliente=?";
		    return template.queryForObject(sql, new Object[]{id},new BeanPropertyRowMapper<Accidente>(Accidente.class));    
		}
		
		public List<Accidente> getAccidentes(){    
		    return template.query("select * from Accidente",new RowMapper<Accidente>(){    
		        public Accidente mapRow(ResultSet rs, int row) throws SQLException {    
		            Accidente acc=new Accidente();    
		            acc.setIdaccidente(rs.getInt(1));    
		            acc.setFecha(rs.getString(2));    
		            acc.setHora(rs.getString(3));
		            acc.setSuceso(rs.getString(4));
		            acc.setLugar(rs.getString(5));
		            acc.setcliente_id(rs.getInt(6));
		            return acc;
		        }    
		    });    
		}    	
		
		
	}


