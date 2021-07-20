package br.com.danielwzoreck;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class PersonTest {

	@Test
	void test() {
		Person person = new Person();
		// Verificar se a chamada do metodo hello() do
		// objeto person é igual ao resultado informado para teste "hello"
		assertEquals("hello", person.hello());
	}

}
