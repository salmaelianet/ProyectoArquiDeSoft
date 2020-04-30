package test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import Facturador.Llamada;
import Facturador.PlanWow;
import Facturador.RegistroPlanWow;

class PlanWowTest {

	 @BeforeAll
	    static void setUp() {
	        RegistroPlanWow wowRegistro = new RegistroPlanWow();
	        wowRegistro.setClientes(new ArrayList<>());
	        PlanWow clienteWow = new PlanWow();
	        clienteWow.setNumeroCliente(7717271);
	        List<Integer> friendNumbers = new ArrayList<>();
	        friendNumbers.add(70809010);
	        friendNumbers.add(70809011);
	        friendNumbers.add(70809012);
	        friendNumbers.add(70809013);
	        clienteWow.setNumerosAmigos(friendNumbers);
	        wowRegistro.registroCliente(clienteWow);
	    }
	
	 @Test
	    public void esNumeroAmigo() {
	        setUp();
	        RegistroPlanWow clienteWow = new RegistroPlanWow();
	        Llamada nuevaLlamada = new Llamada();
	        nuevaLlamada.setNumeroOrigen(7717271);
	        nuevaLlamada.setNumeroDestino(70809011);
	        boolean result = clienteWow.esNumeroAmigo(nuevaLlamada);
	        assertTrue(result);
	    }

}
