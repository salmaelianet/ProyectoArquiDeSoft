package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import Facturador.TarifaPorHora;
import Facturador.TarifaUnica;

class CostoFijoTest {
	private TarifaUnica tarifaUnica = new TarifaUnica(24);

	@Test
	void getCostoPorPlanPostpago() {
		double val = tarifaUnica.calcularCosto();
		assertEquals(val, 24);
	}	
}