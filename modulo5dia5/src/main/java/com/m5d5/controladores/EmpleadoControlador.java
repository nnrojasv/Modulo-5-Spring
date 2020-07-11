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


import com.m5d5.beans.Empleado;
import com.m5d5.dao.EmpleadoDao;

@Controller
public class EmpleadoControlador {

	@Autowired
	EmpleadoDao daoemp;
	
	static Logger log = Logger.getLogger(EmpleadoControlador.class.getName());
	
	 @RequestMapping("/empform")    
	    public String showform(Model m){    
	        m.addAttribute("command", new Empleado());  
	        log.info("Ingreso a formulario de creación de empleado");
	        return "empform";
	    } 
	 
	 @RequestMapping(value="/saveemp",method = RequestMethod.POST)    
	    public String save(@ModelAttribute("emp") Empleado emp){    
	        daoemp.save(emp);
	        log.info("Empleado creado: " + emp.toString());
	        return "redirect:/viewemp";
	    }
	
    @RequestMapping("/viewemp")    
    public String viewemp(Model m){
        List<Empleado> list=daoemp.getEmpleados();
        m.addAttribute("listemp",list);  
        log.info("Listado de empleados");
        return "viewemp";
    }
    
       
    @RequestMapping(value="/editemp/{id}")    
    public String edit(@PathVariable int id, Model m){    
        Empleado emp=daoemp.getEmpById(id);
        m.addAttribute("command",emp);
        log.info("Ingreso a edición de empleado");
        return "empeditform";
    }
    @RequestMapping(value="/editsaveemp",method = RequestMethod.POST)    
    public String editsave(@ModelAttribute("emp") Empleado emp){
        daoemp.update(emp);
        log.info("Procesando edición de empleado");
        return "redirect:/viewemp";
    }
    @RequestMapping(value="/deleteemp/{id}",method = RequestMethod.GET)    
    public String delete(@PathVariable int id){    
		/* try { */
			daoemp.delete(id);
		/*} catch (SQLIntegrityConstraintViolationException e) {
		
			JOptionPane.showInternalMessageDialog(null, "No s epuede eliminane ashjsda yuebkdhfvaj");
		}    */
			  log.debug("DEBUG - Empleado eliminado");
        return "redirect:/viewemp";
    }
	
	
}
