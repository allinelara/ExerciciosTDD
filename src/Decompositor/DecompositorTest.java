package Decompositor;
import static org.junit.Assert.*;

import org.junit.Test;

public class DecompositorTest {

	@Test
	public void test_decompoe_numero_2() {
		assertArrayEquals(new Integer[] {2}, Decompositor.decompoe(2)); 
	}
	@Test
	public void test_decompoe_numero_3() {
		assertArrayEquals(new Integer[] {3}, Decompositor.decompoe(3)); 
	}
	@Test
	public void test_decompoe_numero_4() {
		assertArrayEquals(new Integer[] {2,2}, Decompositor.decompoe(4)); 
	}
	@Test
	public void test_decompoe_numero_9() {
		assertArrayEquals(new Integer[] {3,3}, Decompositor.decompoe(9)); 
	}
	@Test
	public void test_decompoe_numero_grande() {
		assertArrayEquals(new Integer[] {2,3,5,7,11}, Decompositor.decompoe(2*3*5*7*11)); 
	}
}