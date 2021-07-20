package br.com.danielwzoreck;

public class Number {

	private int value;
	
	public Number(int value) {
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
}
