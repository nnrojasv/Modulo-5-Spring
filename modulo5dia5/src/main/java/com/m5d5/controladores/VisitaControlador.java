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


import com.m5d5.beans.Visita;
import com.m5d5.dao.daoVisita;

@Controller
public class VisitaControlador {


	@Autowired
	daoVisita daovis;
	
	static Logger log = Logger.getLogger(VisitaControlador.class.getName());
	
    @RequestMapping("/visform")    
    public String showform(Model m){    
        m.addAttribute("command", new Visita());  
        log.info("Ingreso a formulario de creación de visitas");
        return "visform";
    } 

    @RequestMapping(value="/savevis",method = RequestMethod.POST)    
    public String save(@ModelAttribute("vis") Visita vis){    
    	daovis.save(vis);
    	 log.info("Visita creada: " + vis.toString());
        return "redirect:/viewvis";
    }
    
    @RequestMapping("/viewvis")    
    public String viewcli(Model m){    
        List<Visita> list=daovis.getVisitas();
        m.addAttribute("listvis",list);  
        log.info("Listado de visitas");
        return "viewvis";
    }
    
    @RequestMapping(value="/editvis/{id}")    
    public String edit(@PathVariable int id, Model m){    
        Visita vis=daovis.getVisById(id);
        m.addAttribute("command",vis);
        log.info("Ingreso a edición de visitas");
        return "viseditform";
    }

    @RequestMapping(value="/editsavevis",method = RequestMethod.POST)    
    public String editsave(@ModelAttribute("vis") Visita vis){
    	daovis.update(vis);
    	  log.info("Procesando edición de visitas");
        return "redirect:/viewvis";
    }

    @RequestMapping(value="/deletevis/{id}",method = RequestMethod.GET)    
    public String delete(@PathVariable int id){    
    	daovis.delete(id);   
    	 log.debug("DEBUG - Visita eliminada");
        return "redirect:/viewvis";
    }
    
}


