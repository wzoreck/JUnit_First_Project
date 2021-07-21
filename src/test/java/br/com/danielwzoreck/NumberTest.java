package br.com.danielwzoreck;

import static org.junit.Assume.assumeTrue;
import static org.junit.jupiter.api.Assertions.*;

import java.util.concurrent.TimeUnit;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;

class NumberTest {
	
	@Test
	@Timeout(value = 50, unit =	 TimeUnit.MILLISECONDS)
	void timeoutTest() {
		for (int i=0; i<1000; i++) {
			System.out.println("Teste timeout");
		}	
	}

	// Será executado antes de todos os Test's unitarios, precisa do static antes
	@BeforeAll
	static void beforeAll() {
		System.out.println("Executando o método beforeAll");
	}
	
	// Será executado após todos os Test's unitarios, precisa do static antes
	@AfterAll
	static void afterAll() {
		System.out.println("Executando o método afterAll");
	}
	
	// É executado toda vez antes que um Test seja executado
	@BeforeEach
	void beforeEachMethod() {
		System.out.println("Executando o método beforeEach");
	}
	
	// É executado toda vez apos um Test ser executado
	@AfterEach
	void afterEachMethod() {
		System.out.println("Executando o método afterEach");
	}
	
	// Com a notação Disabled o Test unitário não será executado
	@Test
	@Disabled
	void groupAssertions() {
		int[] numbers = {0, 1, 2, 3, 4};
		// Label
		assertAll("grupo de afirmações", 
				() -> assertEquals(false, new Number(numbers[1]).isEven()),
				() -> assertEquals(false, new Number(numbers[3]).isEven()),
				() -> assertEquals(true, new Number(numbers[4]).isEven())
				);
	}
	
	@Test
	void nullNumberTest() {
		Number n = new Number(null);
		
		// Espera um retorno True, caso contrário para a execuçao do teste!
		assumeTrue(n.getValue() == null);
		
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
