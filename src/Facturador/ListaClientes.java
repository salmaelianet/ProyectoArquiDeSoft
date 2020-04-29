package Facturador;

import java.util.ArrayList;
import java.util.List;

public class ListaClientes {
	private List<Cliente> clientes = new ArrayList<Cliente>();
	
	public void add(Cliente cliente) {
		clientes.add(cliente);
	}
	
}
