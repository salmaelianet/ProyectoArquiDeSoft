package Facturador;

public class TarifaPorHora extends TarifaInterface{

	int duracionLlamada;
	int costoPorMinuto;
	
	public TarifaPorHora() {
		System.out.println("Usted usa la Tarifa Por Hora");
	}
	
	public TarifaPorHora(int duracionLlamada,int costoPorMinuto) {
		this.duracionLlamada=duracionLlamada;
		this.costoPorMinuto=costoPorMinuto;
		System.out.println("La duracion de la llamada es:"+duracionLlamada+" El costo por minuto es: "+costoPorMinuto);
	}

	@Override
	public int calcularCosto() {
		return duracionLlamada*costoPorMinuto;
		// TODO Auto-generated method stub
		
	}

}
