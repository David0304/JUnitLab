package Practica;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Ejercicio1Test {

	@Test
	public void test() {
		Fecha fecha = new Fecha();
		fecha.getFechaConFormato(1);
	}
	@Test
	public void test1() {
		Fecha fecha = new Fecha();
		fecha.getFechaConFormato(2);
	}
	@Test
	public void test2() {
		Fecha fecha = new Fecha();
		fecha.getFechaConFormato(3);
	}
	@Test
	public void test3() {
		Fecha fecha = new Fecha();
		fecha.getFechaConFormato(0);
	}

}
