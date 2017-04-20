package edu.andes.ecos.app.Programa6;

import org.junit.Test;

import edu.uniandes.ecos.modelo.Logica;
import junit.framework.TestCase;

public class PruebasLogica extends TestCase{
	
	@Test
	public void testCalcularXFinal() {
		assertEquals(0.55338, Logica.calcularXFinal(0, 1, 6, 0.20),0.001);
		assertEquals(1.75305, Logica.calcularXFinal(0, 1, 15, 0.45),0.001);
		assertEquals(4.0625, Logica.calcularXFinal(0, 1, 5, 0.495),0.001);
	}
	

	@Test
	public void testCalcularGammaNoEntero() {
		assertEquals(11.63173, Logica.calcularGammaNoEntero(4.5),0.001);
		assertEquals(0.8862269254527579, Logica.calcularGammaNoEntero(1.5),0.001);
		assertEquals(14034.407293483413, Logica.calcularGammaNoEntero(8.5),0.001);
		assertEquals(287.8852778150444, Logica.calcularGammaNoEntero(6.5),0.001);
	}

	@Test
	public void testCalcularFactorial() {
		assertEquals(6, Logica.calcularFactorial(3),0.001);
		assertEquals(3628800, Logica.calcularFactorial(10),0.001);
		assertEquals(120, Logica.calcularFactorial(5),0.001);
		assertEquals(2.43290200817664E18, Logica.calcularFactorial(20),0.001);
	}
	
}
