package numRomano;

import static org.junit.Assert.*;

import org.junit.Test;

public class numRomanoTest {

	@Test
	public void test_14() {
		assertEquals("XIV", NumRomano.transformarDR(14)); 	}

	@Test
	public void test_30() {
		assertEquals("XXX", NumRomano.transformarDR(30)); 	}
	
	@Test
	public void test_42() {
		assertEquals("XLII", NumRomano.transformarDR(42)); 	}
	
	@Test
	public void test_2() {
		assertEquals("II", NumRomano.transformarDR(2)); 	}
	
	@Test
	public void test_17() {
		assertEquals("XVII", NumRomano.transformarDR(17)); 	}
	
	@Test
	public void test_50() {
		assertEquals("L", NumRomano.transformarDR(50)); 	}
	
	@Test
	public void test_8() {
		assertEquals("VIII", NumRomano.transformarDR(8)); 	}
}
