package Facturador;

public class TarifaUnica extends TarifaInterface{
	
	int costo;
	public TarifaUnica() {
		System.out.println("Usted usa la Tarifa Unica");
	}
	
	public TarifaUnica(int costo) {
		this.costo=costo;
		System.out.println("El costo es: "+costo);
	}
	
	int getCosto() {
		return costo;
	}
	
	void setCosto(int costo) {
		this.costo=costo;
	}

	@Override
	public int calcularCosto() {
		// TODO Auto-generated method stub
		return costo;
	}


}
