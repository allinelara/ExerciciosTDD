package Fila;

import static org.junit.Assert.*;


import org.junit.Test;


public class FilaTest {

	@Test
	public void test_adicionar() {
		assertArrayEquals(new Integer[]{3, 6, 16}, Fila.adicionar(16)); 
	}
	@Test
	public void test_remover() {
		assertEquals(3, Fila.remover()); 
	}
	@Test
	public void test_total() {
		assertEquals(3, Fila.totalElementos()); 
	}

}
