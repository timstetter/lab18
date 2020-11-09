package lab18;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;



class PrimeNumbers_Test {

	@Test
	void test() {
		boolean result = PrimeNumbers.isPrime(2);
		assertEquals(true, result);
	}
	@Test
	void test2() {
		boolean result = PrimeNumbers.isPrime(3);
		assertEquals(true, result);
	}
	@Test
	void test3() {
		boolean result = PrimeNumbers.isPrime(5);
		assertEquals(true, result);
	}
	@Test
	void test4() {
		boolean result = PrimeNumbers.isPrime(7);
		assertEquals(true, result);
	}
	@Test
	void test5() {
		boolean result = PrimeNumbers.isPrime(11);
		assertEquals(true, result);
	}
	@Test
	void test6() {
		boolean result = PrimeNumbers.isPrime(2);
		assertEquals(true, result);
	}
	@Test
	void test7() {
		boolean result = PrimeNumbers.isPrime(1);
		assertEquals(false, result);
	}
	@Test
	void test8() {
		boolean result = PrimeNumbers.isPrime(0);
		assertEquals(false, result);
	}
	@Test
	void test9() {
		boolean result = PrimeNumbers.isPrime(10);
		assertEquals(false, result);
	}

	// Test for sequence matching
	@Test
	void test10() {
		int result = PrimeNumbers.primeCounter(2);
		assertEquals(1, result);
	}
	@Test
	void test11() {
		int result = PrimeNumbers.primeCounter(3);
		assertEquals(2, result);
	}
	@Test
	void test12() {
		int result = PrimeNumbers.primeCounter(5);
		assertEquals(3, result);
	}
	@Test
	void test13() {
		int result = PrimeNumbers.primeCounter(7);
		assertEquals(4, result);
	}
	@Test
	void test14() {
		int result = PrimeNumbers.primeCounter(11);
		assertEquals(5, result);
	}
	@Test
	void test15() {
		int result = PrimeNumbers.primeCounter(4);
		assertEquals(0, result);
	}
	
	
	
}
