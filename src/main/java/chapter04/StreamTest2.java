package chapter04;

import static java.util.Comparator.comparing;
import static java.util.stream.Collectors.toList;

import java.util.ArrayList;
import java.util.List;

public class StreamTest2 {

	// java 8 예제
	public static void main(String[] args) {

		List<Dish> menu = new ArrayList<>();

		List<String> lowCaloricDishesName = menu.stream().filter(d -> d.getCalories() < 400)
				.sorted(comparing(Dish::getCalories)).map(Dish::getName).collect(toList());

		List<String> lowCaloricDishesName2 = menu.parallelStream().filter(d -> d.getCalories() < 400)
				.sorted(comparing(Dish::getCalories)).map(Dish::getName).collect(toList());

	}
}
