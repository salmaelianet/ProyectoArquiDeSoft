package test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;
import Facturador.Cliente;

class RegistroCliente {
	private Cliente Cliente1 = new Cliente("Marco", 76911911);
	private Cliente Cliente2 = new Cliente("David", 76023032);
	private Cliente Cliente3 = new Cliente("Alex", 76119911);
	
	private List<Cliente> clientes = new ArrayList<Cliente>();
	
	@Test
	public void registroClienteTest() {
		assertNotNull(clientes.add(Cliente1));
		assertNotNull(clientes.add(Cliente2));
		assertNotNull(clientes.add(Cliente3));
	}
	
	@Test
	public void verificarNumero() {		
		assertEquals(Cliente1.getNumero(), 76911911);
	}
}
