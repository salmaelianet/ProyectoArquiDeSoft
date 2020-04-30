package Facturador;

public class Llamada {
	private String inicioLlamada;
	private String finLlamada;
	private Integer numeroOrigen;
	private Integer numeroDestino;
	private String duracionLlamada;
	private double costo;
	
	public Integer getNumeroOrigen() {
		return numeroOrigen;
	}
	 
	public void setNumeroOrigen(final Integer numeroOrigen){
	    
		this.numeroOrigen = numeroOrigen;
	}
	public Integer getNumeroDestino() {
		return numeroDestino;
	}
	public void setNumeroDestino(final Integer numeroDestino) {
        this.numeroDestino = numeroDestino;
    }
	

    public double getCosto() {
    	return costo;
    }
    public void setCosto(final double costo) { 
    	this.costo = costo; 
    }

}
