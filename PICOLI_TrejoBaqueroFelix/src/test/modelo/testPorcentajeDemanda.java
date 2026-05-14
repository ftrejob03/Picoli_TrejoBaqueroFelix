package test.modelo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import modelo.Estado;

class testPorcentajeDemanda {

	@Test
	void testPorcentajeAbrirPeriodoIncremento() {
		Estado estado = new Estado();
		
		// Escenario 1: Incremento del 10 % de nacimiento
		estado.setFallecidosUltimoPeriodo(100);
		estado.setCapital(1000000);
		
		estado.abrirPeriodo(10.0);
		
		assertEquals(110, estado.getMenores().size(), "Debería haber 110 nacimientos de menores.");
	}
	@Test
	void testPorcentajeAbrirPeriodoDecremento() {
		Estado estado = new Estado();
		
		// Escenario 2: Decremento del 10 % de nacimiento
		estado.setFallecidosUltimoPeriodo(100);
		estado.setCapital(1000000);
		
		estado.abrirPeriodo(-10.0);
		
		assertEquals(90, estado.getMenores().size(), "Debería haber 90 nacimientos de menores.");
	}

}
