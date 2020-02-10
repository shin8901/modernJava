package inActionJava.chapter02;

import java.util.ArrayList;
import java.util.List;

public class Test5 {

	public static void main(String[] args) {
		List<Apple> inventory = new ArrayList<>();
		filterApples(inventory, new ApplePredicate() {
			@Override
			public boolean test(Apple apple) {
				return apple.getWeight() > 200;
			}
		});
	}

	public static List<Apple> filterApples(List<Apple> inventory, ApplePredicate p) {
		List<Apple> result = new ArrayList<>();
		for (Apple apple : inventory) {
			if (p.test(apple)) {
				result.add(apple);
			}
		}
		return result;
	}

}
