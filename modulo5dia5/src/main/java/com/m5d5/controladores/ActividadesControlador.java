package com.m5d5.controladores;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;    
import org.springframework.stereotype.Controller;  
import org.springframework.ui.Model;  
import org.springframework.web.bind.annotation.ModelAttribute;    
import org.springframework.web.bind.annotation.PathVariable;    
import org.springframework.web.bind.annotation.RequestMapping;    
import org.springframework.web.bind.annotation.RequestMethod;

import com.m5d5.beans.Actividades;
import com.m5d5.beans.Cliente;
import com.m5d5.dao.ActividadesDao;
import com.m5d5.dao.ClienteDao;   

@Controller
public class ActividadesControlador {
	
	static Logger log = Logger.getLogger(ActividadesControlador.class.getName());
	
	@Autowired
	ActividadesDao daoact;
	
    @RequestMapping(value="/viewact/{id}")    
    public String edit(@PathVariable int id, Model m){    
        List<Actividades> act=daoact.getActividades(id);
        m.addAttribute("listact",act);
        log.info("Reporte de cliente "+id);
        return "viewact";	
    }
    
    @RequestMapping(value="/viewactglobal")    
    public String viewactglobal(Model m){    
        List<Actividades> act=daoact.getActividadesGlobal();
        m.addAttribute("listact",act);
        log.info("Reporte global");
        return "viewact";	
    }

    
    
}
