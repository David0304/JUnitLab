package Practica;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ContadorTest {

	@Test
	public void testContador1() {
		Contador cont1 = new Contador();
		int esperado = 1;
		int x = 1;
		int y = 9;
		int contador1 = Contador.contador1(x, y);
		assertEquals(contador1, esperado);
	}
	
	@Test
	public void testContador2() {
		Contador cont2 = new Contador();
		int esperado = -1;
		int x = -1;
		int y = 9;
		int contador2 = Contador.contador1(x, y);
		assertEquals(contador2, esperado);
	}
	

}
