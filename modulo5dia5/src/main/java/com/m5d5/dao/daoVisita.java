package com.m5d5.dao;


import java.sql.ResultSet;
import java.sql.SQLException;

import java.util.List;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;


import com.m5d5.beans.Visita;



public class daoVisita  {


		JdbcTemplate template;
		
		public void setTemplate(JdbcTemplate template) {    
		    this.template = template;    
		}
		
		public int save(Visita vis){    
		    String sql="insert into Visitas (direccion,ciudad,fecha, observaciones,resumen,cliente_id, empleado_idempleado) values('"+vis.getDireccion()+"','"+vis.getCiudad()+"','"+vis.getFecha()+"','"+vis.getObservaciones()+"','"+vis.getResumen()+"','"+vis.getcliente_id()+"','"+vis.getempleado_idempleado()+"')";
		    return template.update(sql);
		}
		
		public int update(Visita vis){    
		    String sql="update Visitas set direccion='"+vis.getDireccion()+"', ciudad='"+vis.getCiudad()+"',fecha='"+vis.getFecha()+"', observaciones='"+vis.getObservaciones()+"', resumen='"+vis.getResumen()+"' where idvisita="+vis.getidvisita()+"";
		    return template.update(sql);    
		}   
		
		public int delete(int id){    
		    String sql="delete from Visitas where idvisita="+id+"";
		    return template.update(sql);
		}    

		public Visita getVisById(int id){    
		    String sql="select * from Visitas where idvisita=?";
		    return template.queryForObject(sql, new Object[]{id},new BeanPropertyRowMapper<Visita>(Visita.class));    
		}
		
		public List<Visita> getVisitas(){    
		    return template.query("select * from Visitas",new RowMapper<Visita>(){    
		        public Visita mapRow(ResultSet rs, int row) throws SQLException {    
		            Visita vis=new Visita();    
		            vis.setidvisita(rs.getInt(1));    
		            vis.setDireccion(rs.getString(2));    
		            vis.setCiudad(rs.getString(3));
		            vis.setFecha(rs.getString(4));
		            vis.setObservaciones(rs.getString(6));
		            vis.setResumen(rs.getString(5));
		            vis.setcliente_id(rs.getInt(7));
		            vis.setempleado_idempleado(rs.getInt(8));
		            return vis;
		        }    
		    });    
		}    	
		
		
	}
