package test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.List;

import javax.ejb.embeddable.EJBContainer;

import org.junit.Before;
import org.junit.Test;

import mx.com.vargas.sga.domain.Persona;
import mx.com.vargas.sga.servicio.PersonaService;

public class PersonaServiceTest {

	private PersonaService personaService;

	@Before
	public void setUp() throws Exception {
		EJBContainer contenedor = EJBContainer.createEJBContainer();
		personaService = (PersonaService) contenedor.getContext()
				.lookup("java:global/classes/PersonaServiceRemoteImpl!mx.com.vargas.sga.servicio.PersonaService");
	}

	@Test
	public void testEJBPersonaService() {
		System.out.println("Inicio test EJB PersonaService");
		assertTrue(personaService != null);
		assertEquals(2, personaService.listarPersonas().size());

		System.out.println(
				"El no. de personas es igual a:".concat(Integer.toString(personaService.listarPersonas().size())));
		this.desplegarPersonas(personaService.listarPersonas());

		System.out.println("Fin test EJB PersonasService");
	}

	private void desplegarPersonas(List<Persona> list) {
		for (Persona p : list) {
			System.out.println(p);
		}

	}

}
