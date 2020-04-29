package Facturador;

public class TarifaPorHora extends TarifaInterface{

	int duracionLlamada;
	int costoPorMinuto;
	
	public TarifaPorHora() {}

	
	
	@Override
	public int calcularCosto() {
		return duracionLlamada*costoPorMinuto;
		// TODO Auto-generated method stub
		
	}

}
