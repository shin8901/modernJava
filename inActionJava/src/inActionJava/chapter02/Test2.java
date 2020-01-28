package inActionJava.chapter02;

import java.util.ArrayList;
import java.util.List;

public class Test2 {

	public static void main(String[] args) {

	}

	public static List<Apple> filterApplesByColor(List<Apple> inventory, Color color) {
		List<Apple> result = new ArrayList<>();
		for (Apple apple : inventory) {
			if (color.equals(apple.getColor())) {
				result.add(apple);
			}
		}
		return result;
	}

	public static List<Apple> filterGreenApples(List<Apple> inventory) {
		return filterApplesByColor(inventory, Color.GREEN);
	}

	public static List<Apple> filterRedApples(List<Apple> inventory) {
		return filterApplesByColor(inventory, Color.RED);
	}
	
	
	public static List<Apple> filterApplesByWeight(List<Apple> inventory, int weight) {
		List<Apple> result = new ArrayList<>();
		for (Apple apple : inventory) {
			if (apple.getWeight() > weight) {
				result.add(apple);
			}
		}
		return result;
	}
}
