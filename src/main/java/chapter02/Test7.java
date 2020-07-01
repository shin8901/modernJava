package chapter02;

import java.util.ArrayList;
import java.util.List;

public class Test7 {

	public static void main(String[] args) {
		List<Apple> inventory = new ArrayList<>();
		filter(inventory, (Apple p) -> Color.GREEN.equals(p.getColor()));

		List<String> inventory2 = new ArrayList<>();
		filter(inventory2, (String s) -> s.length() > 10);

		List<Integer> inventory3 = new ArrayList<>();
		filter(inventory3, (Integer i) -> i.intValue() > 100);
	}

	public static <T> List<T> filter(List<T> inventory, Predicate<T> p) {
		List<T> result = new ArrayList<>();
		for (T t : inventory) {
			if (p.test(t)) {
				result.add(t);
			}
		}
		return result;
	}

}

interface Predicate<T> {
	public boolean test(T t);
}
