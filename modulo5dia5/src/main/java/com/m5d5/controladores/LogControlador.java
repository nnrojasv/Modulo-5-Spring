package com.m5d5.controladores;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.m5d5.beans.Bitacora;

@Controller
public class LogControlador {

	static Logger log = Logger.getLogger(LogControlador.class.getName());
	
    @RequestMapping("/revisarlog")    
    public String showform(Model m){
    	
        File archivo = null;
        FileReader fr = null;
        BufferedReader br = null;

        try {
           // Apertura del fichero y creacion de BufferedReader para poder
           // hacer una lectura comoda (disponer del metodo readLine()).
           archivo = new File ("C:\\Users\\mirko\\Documents\\log.out");
           fr = new FileReader (archivo);
           br = new BufferedReader(fr);

           // Lectura del fichero
           List<Bitacora> list = new ArrayList<Bitacora>();
           String linea;
           while((linea=br.readLine())!=null) {
              System.out.println(linea);
              Bitacora msj = new Bitacora("","","",linea);
              list.add(msj);
           }
           
           m.addAttribute("listlog",list);
        }
        catch(Exception e){
           e.printStackTrace();
        }finally{
           // En el finally cerramos el fichero, para asegurarnos
           // que se cierra tanto si todo va bien como si salta 
           // una excepcion.
           try{                    
              if( null != fr ){   
                 fr.close();     
              }                  
           }catch (Exception e2){ 
              e2.printStackTrace();
           }
        }
        log.info("Vista de Bitacora de sistema");
        return "viewlog";
    } 

}
