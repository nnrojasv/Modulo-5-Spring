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

import com.m5d5.beans.Accidente;

import com.m5d5.dao.AccidenteDao;


@Controller
public class AccidenteControlador {

	@Autowired
	AccidenteDao daoacc;
	
	static Logger log = Logger.getLogger(AccidenteControlador.class.getName());
	
    @RequestMapping("/accform")    
    public String showform(Model m){    
        m.addAttribute("command", new Accidente());  
        log.info("Ingreso formulario de creacion de Accidente");
        return "accform";
    } 

    @RequestMapping(value="/saveacc",method = RequestMethod.POST)    
    public String save(@ModelAttribute("acc") Accidente acc){    
        daoacc.save(acc);
        log.info("Accidente creado: " + acc.toString());
        return "redirect:/viewacc";
    }
    
    @RequestMapping("/viewacc")    
    public String viewcli(Model m){    
        List<Accidente> list=daoacc.getAccidentes();
        m.addAttribute("listacc",list);  
        log.info("Listado de accidentes");
        return "viewacc";
    }
    
    @RequestMapping(value="/editacc/{id}")    
    public String edit(@PathVariable int id, Model m){    
        Accidente acc=daoacc.getAccById(id);
        m.addAttribute("command",acc);
        log.info("Ingreso a edición de accidentes");
        return "acceditform";
    }

    @RequestMapping(value="/editsaveacc",method = RequestMethod.POST)    
    public String editsave(@ModelAttribute("acc") Accidente acc){
        daoacc.update(acc);
        log.info("Procesando edición de accidente");
        return "redirect:/viewacc";
    }

    @RequestMapping(value="/deleteacc/{id}",method = RequestMethod.GET)    
    public String delete(@PathVariable int id){    
        daoacc.delete(id);   
        log.debug("DEBUG - Accidente eliminado");
        return "redirect:/viewacc";
    }
    
}
