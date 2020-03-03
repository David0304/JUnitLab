package Practica;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class fechaTest {

	@Test
	public void test() {
		fecha fecha = new fecha();
		Practica.fecha.getFechaConFormato(1);
	}
	@Test
	public void test1() {
		fecha fecha = new fecha();
		Practica.fecha.getFechaConFormato(2);
	}
	@Test
	public void test2() {
		fecha fecha = new fecha();
		Practica.fecha.getFechaConFormato(3);
	}
	@Test
	public void test3() {
		fecha fecha = new fecha();
		Practica.fecha.getFechaConFormato(0);
	}

}
