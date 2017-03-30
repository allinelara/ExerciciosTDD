package Pilha;

import static org.junit.Assert.*;

import org.junit.Test;

import Fila.Fila;

public class PilhaTest {

	public void test_adicionar() {
		assertArrayEquals(new Integer[]{16, 3, 6}, Pilha.adicionar(16)); 
	}
	public void test_remover() {
		assertEquals(6, Pilha.remover()); 
	}

	@Test
	public void test_total() {
		assertEquals(3, Pilha.totalelementos()); 
	}

}
