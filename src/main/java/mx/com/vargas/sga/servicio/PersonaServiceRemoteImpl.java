package mx.com.vargas.sga.servicio;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.Stateless;

import mx.com.vargas.sga.domain.Persona;

@Stateless
public class PersonaServiceRemoteImpl implements PersonaServiceRemote,PersonaService {

	public List<Persona> listarPersonas() {
		List<Persona> personas = new ArrayList<Persona>();
		
		personas.add(new Persona(1, "Noe", "Vargas", "Escorcia", "vargas@gmail.com", "12345678"));
		personas.add(new Persona(2, "Paulina", "Pastrana", "Guzman", "pastrana@gmail.com", "87654321"));
		
		return personas;
	}

	public Persona encontrarPersonaPorId(Persona persona) {
		// TODO Auto-generated method stub
		return null;
	}

	public Persona encontrarPersonaPorEmail(Persona persona) {
		// TODO Auto-generated method stub
		return null;
	}

	public void registrarPersona(Persona persona) {
		// TODO Auto-generated method stub

	}

	public void modificarPersona(Persona persona) {
		// TODO Auto-generated method stub

	}

	public void eliminarPersona(Persona persona) {
		// TODO Auto-generated method stub

	}

}
