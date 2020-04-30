package Facturador;

import java.util.List;


public class RegistroPlanWow {
	
	private List<PlanWow> clients;

	public void setClientes(final List<PlanWow> clients) {
        this.clients = clients;
    }
	
	public void registroCliente(final PlanWow clienteWow) {
        clients.add(clienteWow);
    }
	
	public boolean esNumeroAmigo(final Llamada llamada){
        PlanWow clienteWow = buscarCliente(llamada.getNumeroOrigen());
        return clienteWow.esNumeroAmigo(llamada.getNumeroDestino());
    }

	private PlanWow buscarCliente(Integer numeroOrigen) {
        return clients.stream().filter(client -> client.getNumeroDeTelefono().equals(numeroOrigen)).findFirst().orElse(null);

	}

}
