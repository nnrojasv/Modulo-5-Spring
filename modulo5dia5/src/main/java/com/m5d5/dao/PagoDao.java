package com.m5d5.dao;

import org.springframework.jdbc.core.JdbcTemplate;

import com.m5d5.beans.Pago;

public class PagoDao {

	JdbcTemplate template;
	
	public void setTemplate(JdbcTemplate template) {    
	    this.template = template;    
	}
	
	public int save(Pago p){    
	    String sql="insert into Pagos (mesanio,montoregular,montoadicionales,cliente_id) values('"+p.getMesanio()+"','"+p.getMontoregular()+"','"+p.getMontoadicionales()+"','"+p.getCliente_id()+"')";
	    return template.update(sql);
	}
	
	
}
