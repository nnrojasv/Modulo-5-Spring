package com.m5d5.dao;


import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;


import com.m5d5.beans.Capacitacion;


public class CapacitacionDao {

		JdbcTemplate template;
		
		public void setTemplate(JdbcTemplate template) {    
		    this.template = template;    
		}
		
		public int save(Capacitacion cap){    
		    String sql="insert into Capacitaciones (fecha, hora, numasistentes, visitas_idvisita) values('"+cap.getFecha()+"','"+cap.getHora()+"','"+cap.getNumasistentes()+"','"+cap.getVisitas_idvisita()+"')";
		    return template.update(sql);
		}
		
		public int update(Capacitacion cap){    
		    String sql="update Capacitaciones set fecha='"+cap.getFecha()+"', hora='"+cap.getHora()+"',numasistentes='"+cap.getNumasistentes()+"', visitas_idvistas='"+cap.getVisitas_idvisita()+"' where idcapacitaccion="+cap.getIdcapacitacion()+"";
		    return template.update(sql);    
		}   
		
		public int delete(int id){    
		    String sql="delete from Capacitaciones where idcapacitacion="+id+"";
		    return template.update(sql);
		}    

		public Capacitacion getCapById(int id){    
		    String sql="select * from Capacitaciones where idcapacitacion=?";
		    return template.queryForObject(sql, new Object[]{id},new BeanPropertyRowMapper<Capacitacion>(Capacitacion.class));    
		}
		
		public List<Capacitacion> getCapacitaciones(){    
		    return template.query("select * from Capacitaciones",new RowMapper<Capacitacion>(){    
		        public Capacitacion mapRow(ResultSet rs, int row) throws SQLException {    
		            Capacitacion cap=new Capacitacion();    
		            cap.setIdcapacitacion(rs.getInt(1));    
		            cap.setFecha(rs.getString(2));    
		            cap.setHora(rs.getString(3));
		            cap.setNumasistentes(rs.getInt(4));
		            cap.setVisitas_idvisita(rs.getInt(5));
		            
		            return cap;
		        }    
		    });    
		}    	
		
		
	}


