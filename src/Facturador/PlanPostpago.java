package Facturador;

public class PlanPostpago extends TarificadorInterface{
	
	public PlanPostpago() {
	
	}
    private static PlanPostpago planPostPago;


	public static PlanPostpago getInstance() {
        if (planPostPago == null) {
        	planPostPago = new PlanPostpago();
        }
        return planPostPago;
    }

    @Override
    public double calcularTarifa(final Llamada llamada){
    	
        return calcularTarifa(llamada);
    }




}