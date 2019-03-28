package dos.examen.parcial.controller;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.xml.ws.http.HTTPException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;


import dos.examen.parcial.services.examServices;

@RestController
@RequestMapping(value = "/exams")
@Service
public class examController {



	@Autowired
	private examServices examServices;

	
	@RequestMapping(value="/{ciudad}",method = RequestMethod.GET)
    public ResponseEntity<?> GetCinemas(@PathVariable String ciudad) throws IOException{
        try {            
            return new ResponseEntity<>(examServices.getCiudad(ciudad),HttpStatus.ACCEPTED);
        } catch (HTTPException ex) {
            Logger.getLogger(examController.class.getName()).log(Level.SEVERE, null, ex);
            return new ResponseEntity<>(ex.toString(),HttpStatus.valueOf(ex.getStatusCode()));
        }      
    }

	/**
	@GetMapping("/{ciudad}")
	public ResponseEntity<?> GetCinemaByName(@PathVariable String ciudad)  {        
		System.out.println("si llega");
		try{
			return new ResponseEntity<>(examServices.getCiudad(ciudad), HttpStatus.OK);
		}catch(Exception e){
			return new ResponseEntity<>(e.getStackTrace(), HttpStatus.INTERNAL_SERVER_ERROR);
		}     
	}*/
	
}	  
