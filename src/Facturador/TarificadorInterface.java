package Facturador;

import java.util.Scanner;

public  class TarificadorInterface {
	
	TarifaInterface tarifa;
	

	//Para elegir la tarifa que usara el plan
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
		  
		case 2:
			tarifa= new TarifaPorHora();
		}
		return tarifa;
		
			
	}
	
}
