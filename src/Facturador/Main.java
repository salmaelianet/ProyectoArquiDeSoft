package Facturador;

public class Main {

	public static void main(String[] args) {
		
		
		//TarifaInterface tarifa= new TarifaPorHora(12,2);
		
		//System.out.println(tarifa.calcularCosto());
		
		TarificadorInterface tarificador=new PlanPrepago();
		tarificador.elegirTarifa();

	
	}

}
