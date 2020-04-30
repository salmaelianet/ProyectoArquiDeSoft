package Facturador;

import java.util.List;


public class PlanWow extends TarificadorInterface {
	
	private Integer numeroTelefono;
    private List<Integer> numerosAmigos;
    private static final Integer _CANTIDAD_NUMEROS_AMIGOS = 4;
    

    public Integer getNumeroDeTelefono() {
        return numeroTelefono;
    }
    public void setNumeroCliente(Integer numeroTelefono) {
        this.numeroTelefono = numeroTelefono;
    }

    
    public boolean esNumeroAmigo(final Integer integer) {
        return numerosAmigos.stream().anyMatch(numeroAmigo -> numeroAmigo.equals(integer));
    }
    
	public void setNumerosAmigos(List<Integer> numerosAmigos) {
		if(numerosAmigos.size() <= _CANTIDAD_NUMEROS_AMIGOS) {
            this.numerosAmigos = numerosAmigos;
		}
	}
}
