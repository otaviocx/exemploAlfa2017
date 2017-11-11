package br.com.alfa.exemploAlfa2017;

import junit.framework.TestCase;

public class QuadradoTest extends TestCase {
	
	public void testQuadradoLado3Area() {
		Quadrado quadrado = new Quadrado(3.0);
		
		assertEquals(9.0, quadrado.getArea());
	}

	public void testQuadradoLado3Perimetro() {
		Quadrado quadrado = new Quadrado(3.0);
		
		assertEquals(12.0, quadrado.getPerimetro());
	}
}
