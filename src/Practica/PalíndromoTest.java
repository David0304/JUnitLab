package Practica;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class PalíndromoTest 
{

	@Test
	void testPalíndromo() {
		Palíndromo palindromo = new Palíndromo();
		assertTrue(Palíndromo.palíndromo("ab"));
	}
		
	@Test
	void testPalíndromo1() {
		Palíndromo palindromo2 = new Palíndromo();
		assertFalse(Palíndromo.palíndromo("2020"));
	}
		
	@Test
	void testPalíndromo2() {
		Palíndromo palindromo3 = new Palíndromo();
		assertTrue(Palíndromo.palíndromo("Clase"));
	}

}
