package dos.examen.parcial.persistence;

import java.io.IOException;

import org.springframework.stereotype.Service;

import dos.examen.parcial.html.examHTML;

public class exampersistence {

	public exampersistence() {
	
	}
	
	private String getCiudad(String ciudad) throws IOException {
		examHTML e = new examHTML();
		String ciudad1=e.getCiudad(ciudad);
		return ciudad1;
	}
	
}
