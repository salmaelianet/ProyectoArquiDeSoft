package Facturador;

import java.time.LocalDateTime;

public class Llamada {
	private LocalDateTime inicioLlamada;
	private LocalDateTime finLlamada;
	private Integer numeroOrigen;
	private Integer numeroDestino;
	private String duracionLlamada;
	private double costo;
	
	public Integer getNumeroOrigen() {
		return numeroOrigen;
	}
	 
	public void setNumeroOrigen(Integer numeroOrigen){
	    
		this.numeroOrigen = numeroOrigen;
	}
	public Integer getNumeroDestino() {
		return numeroDestino;
	}
	public void setNumeroDestino(Integer numeroDestino) {
        this.numeroDestino = numeroDestino;
    }
	
	public LocalDateTime getInicioLlamada() {
        return inicioLlamada;
    }

    public void setInicioLlamada(final LocalDateTime inicioLlamada) {
        this.inicioLlamada = inicioLlamada;
    }

    public LocalDateTime getFinLlamada() {
        return finLlamada;
    }

    public void setFinLlamada(final LocalDateTime finLlamada) {
        this.finLlamada = finLlamada;
    }
	
    public double getCosto() {
    	return costo;
    }
    public void setCosto(final double costo) { 
    	this.costo = costo; 
    }

}
