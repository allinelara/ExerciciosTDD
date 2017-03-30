package FizzBuzz;

import static org.junit.Assert.*;

import org.junit.Test;

import Decompositor.Decompositor;

public class FizzBuzzTest {

	@Test
	public void test_multiplos_3() {
		assertEquals("Fizz", FizzBuzz.verificaNum(9)); 
	}
	@Test
	public void test_multiplos_5() {
		assertEquals("Buzz", FizzBuzz.verificaNum(50)); 
	}

	@Test
	public void test_multiplos_3_5() {
		assertEquals("FizzBuzz", FizzBuzz.verificaNum(15)); 
	}
	
	@Test
	public void test_outros_num() {
		assertEquals("14", FizzBuzz.verificaNum(14)); 
	}
	
	@Test
	public void test_array() {
		assertArrayEquals(new String[]{ "1", "2", "Fizz", "4", "Buzz", "Fizz", "7", "8", "Fizz", "Buzz", "11", "Fizz", "13", "14", "FizzBuzz", "16"}, FizzBuzz.arrayDeStrings(16)); 
	}
}
