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


import com.m5d5.beans.Checklist;
import com.m5d5.dao.ChecklistDao;


@Controller
public class ChecklistControlador {

	@Autowired
	ChecklistDao daoch;
	
	static Logger log = Logger.getLogger(ChecklistControlador.class.getName());
	
    @RequestMapping("/chform")    
    public String showform(Model m){    
        m.addAttribute("command", new Checklist());  
        log.info("Ingreso formulario de creacion de lista de chequeo");
        return "chform";
    } 

    @RequestMapping(value="/savech",method = RequestMethod.POST)    
    public String save(@ModelAttribute("ch") Checklist ch){    
        daoch.save(ch);
        log.info("Lista de chequeo creado: " + ch.toString());
        return "redirect:/viewch";
    }
    
    @RequestMapping("/viewch")    
    public String viewcli(Model m){    
        List<Checklist> list=daoch.getChecklist();
        m.addAttribute("listch",list);  
        log.info("Listas de Chequeo");
        return "viewch";
    }
    
    @RequestMapping(value="/editch/{id}")    
    public String edit(@PathVariable int id, Model m){    
        Checklist ch=daoch.getCheById(id);
        m.addAttribute("command",ch);
        log.info("Ingreso a edición de lista de chequeo");
        return "cheditform";
    }

    @RequestMapping(value="/editsavech",method = RequestMethod.POST)    
    public String editsave(@ModelAttribute("ch") Checklist ch){
        daoch.update(ch);
        log.info("Procesando edición de lista de chequeo");
        return "redirect:/viewacc";
    }

    @RequestMapping(value="/deletech/{id}",method = RequestMethod.GET)    
    public String delete(@PathVariable int id){    
        daoch.delete(id);   
        log.debug("DEBUG - Lista de chequeo eliminada");
        return "redirect:/viewch";
    }
    
}
