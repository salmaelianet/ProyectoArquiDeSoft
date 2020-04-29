package Facturador;

public abstract class TarificadorInterface {
	
	TarifaInterface tarifa;
	
	public abstract void calcularCosto();

	//Para elegir la tarifa que usara el plan
	public TarifaInterface elegirTarifa() {
		int opcion = 0;
		System.out.println("Elegir tarifa que desea usar para el plan:");
		System.out.println("1.Tarifa Unica");
		System.out.println("2.Tarifa Por Hora");
		
		TarifaInterface tarifa = null;
		
		switch (opcion) {
		case 1:
			tarifa= new TarifaUnica();
		  
		case 2:
			tarifa= new TarifaPorHora();
		}
		return tarifa;
		
			
	}
	
}
