package com.m5d5.controladores;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Controller;  
import org.springframework.ui.Model;  
import org.springframework.web.bind.annotation.ModelAttribute;    
import org.springframework.web.bind.annotation.PathVariable;    
import org.springframework.web.bind.annotation.RequestMapping;    
import org.springframework.web.bind.annotation.RequestMethod;

import com.m5d5.beans.Accidente;
import com.m5d5.beans.Cliente;
import com.m5d5.dao.ClienteDao;   

@Controller
public class ClienteControlador {

	@Autowired
	ClienteDao dao;
	
   Logger log = Logger.getLogger(ClienteControlador.class.getName());
	
    @RequestMapping("/cliform")    
    public String showform(Model m){    
        m.addAttribute("command", new Cliente()); 
        log.info("Ingreso a formulario de creación de clientes");
        return "cliform";
    } 

    @RequestMapping(value="/save",method = RequestMethod.POST)    
    public String save(@ModelAttribute("cli") Cliente cli){    
        dao.save(cli);
        log.info("Cliente creado: " + cli.toString());
        return "redirect:/viewcli";
    }
    
    @RequestMapping("/viewcli")    
    public String viewcli(Model m){    
        List<Cliente> list=dao.getClientes();
        m.addAttribute("list",list);  
        log.info("Listado de clientes");
        return "viewcli";
    }
    
    @RequestMapping(value="/editcli/{id}")    
    public String edit(@PathVariable int id, Model m){    
        Cliente cli=dao.getCliById(id);
        m.addAttribute("command",cli);
        log.info("Ingreso a edición de clientes");
        return "clieditform";
    }

    @RequestMapping(value="/editsave",method = RequestMethod.POST)    
    public String editsave(@ModelAttribute("cli") Cliente cli){
        dao.update(cli);
        log.info("Procesando edición de clientes");
        return "redirect:/viewcli";
    }

    @RequestMapping(value="/deletecli/{id}",method = RequestMethod.GET)    
    public String delete(@PathVariable int id){    
        dao.delete(id);  
        log.debug("DEBUG - Cliente eliminado");
        return "redirect:/viewcli";
    }
    
    @RequestMapping("/viewtasa")    
    public String viewtasa(Model m){    
        List<Cliente> list=dao.tasaAcc();
        m.addAttribute("listtasa",list);  
        log.info("Listado Accidentabilidad");
        return "viewtasa";
    }
    
    @RequestMapping("/viewmoro")    
    public String viewmoro(Model m){    
        List<Cliente> list=dao.morosidad();
        m.addAttribute("listmoro",list);
        
        log.info("Listado morosidad");
        return "viewmoro";
    }
 
 
	
    
}
