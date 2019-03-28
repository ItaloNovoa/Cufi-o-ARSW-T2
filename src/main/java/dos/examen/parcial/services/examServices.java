package dos.examen.parcial.services;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import dos.examen.parcial.html.examHTML;


@Service
public class examServices {

	@Autowired
    examHTML exam=null;
	
	public String getCiudad(String ciudad) throws IOException {
		try {
			return exam.getCiudad(ciudad);
		} catch (Exception e) {
			System.out.println("Something went wrong.");;
		}
		return null;		
	}

}
