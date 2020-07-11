package com.m5d5.dao;


import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;


import com.m5d5.beans.Checklist;


public class ChecklistDao {

		JdbcTemplate template;
		
		public void setTemplate(JdbcTemplate template) {    
		    this.template = template;    
		}
		
		public int save(Checklist ch){    
		    String sql="insert into Chequeo (detalle, estado, visitas_idvisita) values('"+ch.getDetalle()+"','"+ch.getEstado()+"','"+ch.getVisitas_idvisita()+"')";
		    return template.update(sql);
		}
		
		public int update(Checklist ch){    
		    String sql="update Chequeo set detalle='"+ch.getDetalle()+"', estado='"+ch.getEstado()+"',visitas_idvisita='"+ch.getVisitas_idvisita()+"' where idchequeo="+ch.getIdchequeo()+"";
		    return template.update(sql);    
		}   
		
		public int delete(int id){    
		    String sql="delete from Chequeo where idchequeo="+id+"";
		    return template.update(sql);
		}    

		public Checklist getCheById(int id){    
		    String sql="select * from Chequeo where idchequeo=?";
		    return template.queryForObject(sql, new Object[]{id},new BeanPropertyRowMapper<Checklist>(Checklist.class));    
		}
		
		public List<Checklist> getChecklist(){    
		    return template.query("select * from Chequeo",new RowMapper<Checklist>(){    
		        public Checklist mapRow(ResultSet rs, int row) throws SQLException {    
		            Checklist ch=new Checklist();    
		            ch.setIdchequeo(rs.getInt(1));    
		            ch.setDetalle(rs.getString(2));    
		            ch.setEstado(rs.getString(3));
		            ch.setVisitas_idvisita(rs.getInt(4));
		           
		            return ch;
		        }    
		    });    
		}    	
		
		
	}


