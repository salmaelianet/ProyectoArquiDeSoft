package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import Facturador.TarifaPorHora;

class CostoMinutoTest {
	private TarifaPorHora tarifaxhora = new TarifaPorHora(24,1);

	@Test
	void getCostoPorPlanPrepago() {
		double val = tarifaxhora.calcularCosto();
		assertEquals(val, 24);
	}

}
