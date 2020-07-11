package com.m5d5.dao;


import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.m5d5.beans.Actividades;
import com.m5d5.beans.Asesoria;
import com.m5d5.beans.Capacitacion;
import com.m5d5.beans.Checklist;
import com.m5d5.beans.Visita;


public class ActividadesDao {

		JdbcTemplate template;
		public void setTemplate(JdbcTemplate template) {    
		    this.template = template;    
		}
		
		public List<Actividades> getActividadesGlobal(){    
		    return template.query("select * from cliente\r\n" + 
		    		"left join visitas on cliente.id=visitas.cliente_id\r\n" + 
		    		"left join chequeo on visitas.idvisita = chequeo.visitas_idvisita\r\n" + 
		    		"left join capacitaciones on visitas.idvisita = capacitaciones.visitas_idvisita\r\n" + 
		    		"left join asesorias on visitas.idvisita = asesorias.visitas_idvisita ",new RowMapper<Actividades>(){    
		        
		    	public Actividades mapRow(ResultSet rs, int row) throws SQLException {    
		           Actividades act=new Actividades();
		            
		           List<Visita> lisvis =new  ArrayList<Visita>();
		           List<Checklist> lische =new  ArrayList<Checklist>();
		           List<Capacitacion> liscap =new  ArrayList<Capacitacion>();
		           List<Asesoria> lisas =new  ArrayList<Asesoria>();
		           
		            while(rs.next()) {
		            	 
		            Visita vis = new Visita();
		           	Asesoria as = new Asesoria();
		           	Capacitacion cap = new Capacitacion ();
		            Checklist che = new Checklist();
		            	
		            vis.setidvisita(rs.getInt(7));    
		            vis.setDireccion(rs.getString(8));    
		            vis.setCiudad(rs.getString(9));
		            vis.setFecha(rs.getString(10));
		            vis.setResumen(rs.getString(11));
		            vis.setObservaciones(rs.getString(12));
		            vis.setempleado_idempleado(rs.getInt(13));
		            vis.setcliente_id(rs.getInt(14));
		            
		            che.setIdchequeo(rs.getInt(15));
		            che.setDetalle(rs.getString(16));
		            che.setEstado(rs.getString(17));
		            che.setVisitas_idvisita(rs.getInt(18));
		            
		            cap.setIdcapacitacion(rs.getInt(19));
		            cap.setFecha(rs.getString(20));
		            cap.setHora(rs.getString(21));
		            cap.setNumasistentes(rs.getInt(22));
		            cap.setVisitas_idvisita(rs.getInt(23));
		            
		            as.setidasesoria(rs.getInt(24));
		            as.setDetalle(rs.getString(25));
		            as.setGestion(rs.getString(26));
		            as.setpropuestas(rs.getString(27));
		            as.setFecha(rs.getString(28));
		            as.setespecial(rs.getString(29));
		            as.setvisitas_idvisita(rs.getInt(30));
		            
		            lisvis.add(vis);
		            lische.add(che);
		            liscap.add(cap);
		            lisas.add(as);
		            
		          }  
		            act.setVisitas(lisvis);
		            act.setchecklist(lische);
		            act.setCapacitaciones(liscap);
		            act.setAsesorias(lisas);
		            return act;
		        }    
		    });    
		}   
		
		public List<Actividades> getActividades(int cliente){    
		    return template.query("select * from cliente\r\n" + 
		    		"left join visitas on cliente.id=visitas.cliente_id\r\n" + 
		    		"left join chequeo on visitas.idvisita = chequeo.visitas_idvisita\r\n" + 
		    		"left join capacitaciones on visitas.idvisita = capacitaciones.visitas_idvisita\r\n" + 
		    		"left join asesorias on visitas.idvisita = asesorias.visitas_idvisita where cliente.id="+cliente,new RowMapper<Actividades>(){    
		        
		    	public Actividades mapRow(ResultSet rs, int row) throws SQLException {    
		           Actividades act=new Actividades();
		            
		           List<Visita> lisvis =new  ArrayList<Visita>();
		           List<Checklist> lische =new  ArrayList<Checklist>();
		           List<Capacitacion> liscap =new  ArrayList<Capacitacion>();
		           List<Asesoria> lisas =new  ArrayList<Asesoria>();
		           
		            while(rs.next()) {
		            	 
		            Visita vis = new Visita();
		           	Asesoria as = new Asesoria();
		           	Capacitacion cap = new Capacitacion ();
		            Checklist che = new Checklist();
		            	
		            vis.setidvisita(rs.getInt(7));    
		            vis.setDireccion(rs.getString(8));    
		            vis.setCiudad(rs.getString(9));
		            vis.setFecha(rs.getString(10));
		            vis.setResumen(rs.getString(11));
		            vis.setObservaciones(rs.getString(12));
		            vis.setempleado_idempleado(rs.getInt(13));
		            vis.setcliente_id(rs.getInt(14));
		            
		            che.setIdchequeo(rs.getInt(15));
		            che.setDetalle(rs.getString(16));
		            che.setEstado(rs.getString(17));
		            che.setVisitas_idvisita(rs.getInt(18));
		            
		            cap.setIdcapacitacion(rs.getInt(19));
		            cap.setFecha(rs.getString(20));
		            cap.setHora(rs.getString(21));
		            cap.setNumasistentes(rs.getInt(22));
		            cap.setVisitas_idvisita(rs.getInt(23));
		            
		            as.setidasesoria(rs.getInt(24));
		            as.setDetalle(rs.getString(25));
		            as.setGestion(rs.getString(26));
		            as.setpropuestas(rs.getString(27));
		            as.setFecha(rs.getString(28));
		            as.setespecial(rs.getString(29));
		            as.setvisitas_idvisita(rs.getInt(30));
		            
		            lisvis.add(vis);
		            lische.add(che);
		            liscap.add(cap);
		            lisas.add(as);
		            
		          }  
		            act.setVisitas(lisvis);
		            act.setchecklist(lische);
		            act.setCapacitaciones(liscap);
		            act.setAsesorias(lisas);
		            return act;
		        }    
		    });    
		}    	
		
		
	}


