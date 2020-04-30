package Facturador;

import java.time.temporal.ChronoUnit;


public class PlanPrepago extends TarificadorInterface {

	public PlanPrepago() {
		System.out.println("Plan prepago");
	}
	private double costoPorHora;
	
	public void setCostPerHour(final double costoPorHora) {
        this.costoPorHora = costoPorHora;
    }

	 @Override
	    public double calcularTarifa(final Llamada llamada) {
	        double segundosLlamada = ChronoUnit.SECONDS.between(llamada.getInicioLlamada(), llamada.getFinLlamada());
	        double horaLlamada = (segundosLlamada/ 3600);
	        return costoPorHora * horaLlamada;
	    }
	 }