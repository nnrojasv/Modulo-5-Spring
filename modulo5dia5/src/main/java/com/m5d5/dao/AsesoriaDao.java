package com.m5d5.dao;


import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import com.m5d5.beans.Asesoria;


public class AsesoriaDao {

	JdbcTemplate template;
	
	public void setTemplate(JdbcTemplate template) {    
	    this.template = template;    
	}
	
	public int save(Asesoria as){    
	    String sql="insert into Asesorias (detalle,gestion,propuestas,especial,visitas_idvisita) values('"+as.getDetalle()+"','"+as.getGestion()+"','"+as.getpropuestas()+"','"+as.getespecial()+"','"+as.getvisitas_idvisita()+"')";
	    return template.update(sql);
	}
	
	public int update(Asesoria as){    
	    String sql="update Asesorias set detalle='"+as.getDetalle()+"', Gestion='"+as.getGestion()+"',propuestas='"+as.getpropuestas()+"', especial='"+as.getespecial()+"' where idasesoria="+as.getidasesoria()+"";
	    return template.update(sql);    
	}   
	
	public int delete(int id){    
	    String sql="delete from asesorias where idasesoria="+id+"";
	    return template.update(sql);
	}    

	public Asesoria getAsById(int id){    
	    String sql="select * from Asesorias where idasesoria=?";
	    return template.queryForObject(sql, new Object[]{id},new BeanPropertyRowMapper<Asesoria>(Asesoria.class));    
	}
	
	public List<Asesoria> getAsesorias(){    
	    return template.query("select * from Asesorias",new RowMapper<Asesoria>(){    
	        public Asesoria mapRow(ResultSet rs, int row) throws SQLException {    
	            Asesoria as=new Asesoria();    
	            as.setidasesoria(rs.getInt(1));    
	            as.setDetalle(rs.getString(2));    
	            as.setGestion(rs.getString(3));
	            as.setpropuestas(rs.getString(4));
	            as.setFecha(rs.getString(5));
	            as.setespecial(rs.getString(6));
	            as.setvisitas_idvisita(rs.getInt(7));
	            return as;
	        }    
	    });    
	}    	
	
	
}
