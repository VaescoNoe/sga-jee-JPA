package mx.com.vargas.sga.cliente;

import java.util.List;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

import mx.com.vargas.sga.domain.Persona;
import mx.com.vargas.sga.servicio.PersonaServiceRemote;

public class ClientePersonaService {

	public static void main(String[] args) {
		
		System.out.println("Inicio llamada el EJB desde cliente\n");
		try {
			Context jndi = new InitialContext();
			PersonaServiceRemote personaSerive = (PersonaServiceRemote) jndi.lookup("java:global/sga-jee/PersonaServiceRemoteImpl!mx.com.vargas.sga.servicio.PersonaServiceRemote");
			
			List<Persona> personas = personaSerive.listarPersonas();
			
			for(Persona p: personas) {
				System.out.println(p);
			}
			System.out.println("Fin llamada EJB desde cliente\n");
		} catch (NamingException e) {
			e.printStackTrace();
		}
	}
}
