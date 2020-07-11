package com.m5d5.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;


import com.m5d5.beans.Mejora;

public class MejoraDao {


		JdbcTemplate template;
		
		public void setTemplate(JdbcTemplate template) {    
		    this.template = template;    
		}
		
		public int save(Mejora mj){    
		    String sql="insert into Mejoras (fecha,motivo,actividades,estado,cliente_id) values('"+mj.getFecha()+"','"+mj.getMotivo()+"','"
		+mj.getActividades()+"','"+mj.getEstado()+"','"+mj.getCliente_id()+"')";
		    return template.update(sql);
		}
		
		public int update(Mejora mj){    
		    String sql="update Mejoras set fecha='"+mj.getFecha()+"', motivo='"+mj.getMotivo()+"',actividades='"+mj.getActividades()
		    +"', estado='"+mj.getEstado()+"', cliente_id='"+mj.getCliente_id()+ "'  where idmejora=" + mj.getidmejora();
		    return template.update(sql);    
		}   
		
		public int delete(int id){    
		    String sql="delete from Mejoras where idmejora="+id+"";
		    return template.update(sql);
		}    

		public Mejora getMejById(int id){    
		    String sql="select * from Mejoras where idmejora=?";
		    return template.queryForObject(sql, new Object[]{id},new BeanPropertyRowMapper<Mejora>(Mejora.class));    
		}
		
		public List<Mejora> getMejoras(){    
		    return template.query("select * from Mejoras",new RowMapper<Mejora>(){    
		        public Mejora mapRow(ResultSet rs, int row) throws SQLException {    
		            Mejora mj=new Mejora();    
		            mj.setidmejora(rs.getInt(1));    
		            mj.setFecha(rs.getString(2));    
		            mj.setMotivo(rs.getString(3));
		            mj.setActividades(rs.getString(4));
		            mj.setEstado(rs.getString(5));
		            mj.setCliente_id(rs.getInt(6));
		            return mj;
		        }    
		    });    
		}  
}
		
		
	
