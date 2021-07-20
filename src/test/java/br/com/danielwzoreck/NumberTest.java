package br.com.danielwzoreck;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class NumberTest {
	
	@Test
	void nullNumberTest() {
		Number n = new Number();
		// Espera-se retornar um null
		assertNull(n.getValue());
		// Testar excessões, quando chamado o método isEven() espera-se um NullPointerException
		assertThrows(NullPointerException.class, () -> {
			n.isEven();
		});
		
	}
	
	@Test
	void negativeNumber2Test() {
		Number n = new Number(-2);
		assertEquals(true, n.isEven());
		assertEquals(false, n.isOdd());
	}
	
	@Test
	void negativeNumber1Test() {
		Number n = new Number(-1);
		assertEquals(false, n.isEven());
		assertEquals(true, n.isOdd());
	}
 
	@Test
	void number0Test() {
		Number n = new Number(0);
		assertEquals(true, n.isEven());
		assertEquals(false, n.isOdd());
	}
	
	@Test
	void number2Test() {
		Number n = new Number(2);
		assertEquals(true, n.isEven());
		assertEquals(false, n.isOdd());
	}
	
	@Test
	void number3Test() {
		Number n = new Number(3);
		assertEquals(true, n.isOdd());
		assertEquals(false, n.isEven());
	}

}
