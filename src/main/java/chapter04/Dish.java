package chapter04;

public class Dish {

	public Dish(int calories, String name, Type type) {
		super();
		this.calories = calories;
		this.name = name;
		this.type = type;
	}

	private final int calories;
	private final String name;
	private final Type type;

	public String getName() {
		return name;
	}

	public Type getType() {
		return type;
	}

	public int getCalories() {
		return calories;
	}

	/*
	 * public void setCalories(int calories) { this.calories = calories; }
	 * 
	 * public String getName() { return name; }
	 * 
	 * public void setName(String name) { this.name = name; }
	 * 
	 * public Type getType() { return type; }
	 * 
	 * public void setType(Type type) { this.type = type; }
	 */

	public enum Type {
		MEAT, FISH, OTHER
	}

}
