package chapter02;

public enum Color {

	RED(0), GREEN(1);

	private int value;

	Color(int i) {
		value = i;
	}

	public boolean equals(int value) {
		return this.value == value;
	}
}
