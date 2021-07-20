package br.com.danielwzoreck;

public class Number {

	/* Utilizando a classe Integer ao inves do tipo primitivo int
	 * caso seja criado sem passar um valor no construtor o valor
	 * sera nullo, com int por padrão é 0
	*/
	private Integer value;
	
	public Number(Integer value) {
		this.value = value;
	}
	
	// É par
	public boolean isEven() {
		if (value % 2 == 0)
			return true;
		return false;
	}
	
	// ë diferente
	public boolean isOdd() {
		if (!isEven())
			return true;
		return false;
	}

	public Integer getValue() {
		return value;
	}

	public void setValue(Integer value) {
		this.value = value;
	}
	
}
