package com.m5d5.dao;


import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.m5d5.beans.Accidente;


public class AccidenteDao {

		JdbcTemplate template;
		
		public void setTemplate(JdbcTemplate template) {    
		    this.template = template;    
		}
		
		public int save(Accidente acc){    
		    String sql="insert into Accidentes (fecha,hora,suceso,lugar,cliente_id) values('"+acc.getFecha()+"','"+acc.getHora()+"','"+acc.getSuceso()+"','"+acc.getLugar()+"','"+acc.getcliente_id()+"')";
		    return template.update(sql);
		}
		
		public int update(Accidente acc){    
		    String sql="update Accidentes set fecha='"+acc.getFecha()+"', hora='"+acc.getHora()+"',suceso='"+acc.getSuceso()+"', lugar='"+acc.getLugar()+"' where idaccidente="+acc.getIdaccidente()+"";
		    return template.update(sql);    
		}   
		
		public int delete(int id){    
		    String sql="delete from Accidentes where idAccidente="+id+"";
		    return template.update(sql);
		}    

		public Accidente getAccById(int id){    
		    String sql="select * from Accidentes where idAccidente=?";
		    return template.queryForObject(sql, new Object[]{id},new BeanPropertyRowMapper<Accidente>(Accidente.class));    
		}
		
		public List<Accidente> getAccidentes(){    
		    return template.query("select * from Accidentes",new RowMapper<Accidente>(){    
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


