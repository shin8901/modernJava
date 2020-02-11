package chapter03;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class StreamTest1 {

	// java 7 예제
	public static void main(String[] args) {

		List<Dish> menu = new ArrayList<>();
		List<Dish> lowCaloriesDishes = new ArrayList<>();

		for (Dish dish : menu) { // 누적자로 요소 필터링
			if (dish.getCalories() < 400) {
				lowCaloriesDishes.add(dish);
			}
		}

		Collections.sort(lowCaloriesDishes, new Comparator<Dish>() {
			@Override
			public int compare(Dish o1, Dish o2) {
				return Integer.compare(o1.getCalories(), o2.getCalories());
			}
		});

		List<Dish> lowCaloricDishesName = new ArrayList<>();

		for (Dish dish : lowCaloriesDishes) { // 누적자로 요소 필터링
			lowCaloricDishesName.add(dish);
		}
	}
}
