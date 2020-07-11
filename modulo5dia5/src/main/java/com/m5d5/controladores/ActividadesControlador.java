package com.m5d5.controladores;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;    
import org.springframework.stereotype.Controller;  
import org.springframework.ui.Model;  
import org.springframework.web.bind.annotation.ModelAttribute;    
import org.springframework.web.bind.annotation.PathVariable;    
import org.springframework.web.bind.annotation.RequestMapping;    
import org.springframework.web.bind.annotation.RequestMethod;

import com.m5d5.beans.Cliente;
import com.m5d5.dao.ClienteDao;   

@Controller
public class ActividadesControlador {

	@Autowired
	ClienteDao dao;
	
    @RequestMapping("/actform")    
    public String showform(Model m){    
        m.addAttribute("command", new Cliente());  
        return "cliform";
    } 

    @RequestMapping(value="/actsave",method = RequestMethod.POST)    
    public String save(@ModelAttribute("cli") Cliente cli){    
        dao.save(cli);
        return "redirect:/viewcli";
    }
    
    @RequestMapping("/viewact")    
    public String viewcli(Model m){    
        List<Cliente> list=dao.getClientes();
        m.addAttribute("list",list);  
        return "viewcli";
    }
    
    @RequestMapping(value="/editact/{id}")    
    public String edit(@PathVariable int id, Model m){    
        Cliente cli=dao.getCliById(id);
        m.addAttribute("command",cli);
        return "clieditform";
    }

    @RequestMapping(value="/editsaveact",method = RequestMethod.POST)    
    public String editsave(@ModelAttribute("cli") Cliente cli){
        dao.update(cli);
        return "redirect:/viewcli";
    }

    @RequestMapping(value="/deleteact/{id}",method = RequestMethod.GET)    
    public String delete(@PathVariable int id){    
        dao.delete(id);    
        return "redirect:/viewcli";
    }
    
}
