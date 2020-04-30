package Facturador;

import java.util.Scanner;

public  class TarificadorInterface {
	
	TarifaInterface tarifa;
		public TarifaInterface elegirTarifa() {
		
		System.out.println("Elegir tarifa que desea usar para el plan:");
		System.out.println("1.Tarifa Unica");
		System.out.println("2.Tarifa Por Hora");
		
		TarifaInterface tarifa = null;
		Scanner capt = new Scanner(System.in);
		int opcion = capt.nextInt();
		
		switch (opcion) {
		case 1:
			tarifa= new TarifaUnica();
			break;
		case 2:
			tarifa= new TarifaPorHora();
			break;
		default:
			System.out.println("La opcion es invalida");
		break;
		}
		return tarifa;
	}

	public double calcularTarifa(Llamada llamada) {
		return 0;
	}
}