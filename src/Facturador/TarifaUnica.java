package Facturador;

public class TarifaUnica extends TarifaInterface{
	
	int costo;
	public TarifaUnica() {};
	
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
