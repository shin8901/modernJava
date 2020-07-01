package chapter02;

import java.util.ArrayList;
import java.util.List;

public class Test3 {

	public static void main(String[] args) {
		List<Apple> inventory = new ArrayList<>();
		filter(inventory, Color.GREEN, 0, true);
		filter(inventory, null, 160, false);
	}

	public static List<Apple> filter(List<Apple> inventory, Color color, int weight, boolean flag) {
		List<Apple> result = new ArrayList<>();
		for (Apple apple : inventory) {
			if ((flag && color.equals(apple.getColor())) || (!flag && apple.getWeight() > weight)) {
				result.add(apple);
			}
		}
		return result;
	}

}
