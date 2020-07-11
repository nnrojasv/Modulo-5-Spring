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


import com.m5d5.beans.Mejora;

import com.m5d5.dao.MejoraDao;   

@Controller
public class MejoraControlador {

	@Autowired
	MejoraDao daomj;
	
	static Logger log = Logger.getLogger(MejoraControlador.class.getName());
	
    @RequestMapping("/mejform")    
    public String showform(Model m){    
        m.addAttribute("command", new Mejora());
        log.info("Ingreso a formulario de creación de mejoras");
        return "mejform";
    } 

    @RequestMapping(value="/savemj",method = RequestMethod.POST)    
    public String save(@ModelAttribute("mj") Mejora mj){    
        daomj.save(mj);
        log.info("Mejora creada: " + mj.toString());
        return "redirect:/viewmej";
    }
    
    @RequestMapping("/viewmej")    
    public String viewcli(Model m){    
        List<Mejora> list=daomj.getMejoras();
        m.addAttribute("listmj",list);  
        log.info("Listado de mejoras");
        return "viewmej";
    }
    
    @RequestMapping(value="/editmj/{id}")    
    public String edit(@PathVariable int id, Model m){    
        Mejora mj=daomj.getMejById(id);
        m.addAttribute("command",mj);
        log.info("Ingreso a edición de mejoras");
        return "mejeditform";
    }

    @RequestMapping(value="/editsavemj",method = RequestMethod.POST)    
    public String editsave(@ModelAttribute("mj") Mejora mj){
        daomj.update(mj);
        log.info("Procesando edición de mejoras");
        return "redirect:/viewmej";
    }

    @RequestMapping(value="/deletemj/{id}",method = RequestMethod.GET)    
    public String delete(@PathVariable int id){    
        daomj.delete(id);  
        log.debug("DEBUG - Mejora eliminada");
        return "redirect:/viewmej";
    }
    
}
