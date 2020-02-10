package inActionJava.chapter02;

import java.util.ArrayList;
import java.util.List;

public class Test4 {

	public static void main(String[] args) {
		List<Apple> inventory = new ArrayList<>();
		filterApples(inventory, new AppleHeavyWeightPredicate());		
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
