package chapter02;

import java.util.ArrayList;
import java.util.List;

public class Test1 {

	public static void main(String[] args) {

	}

	public static List<Apple> filterGreenApples(List<Apple> inventory) {
		List<Apple> result = new ArrayList<>();
		for (Apple apple : inventory) {
			if (Color.GREEN.equals(apple.getColor())) {
				result.add(apple);
			}
		}
		return result;
	}
}
