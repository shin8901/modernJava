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

		/**
		 * <p>
		 * parallelStream으로 바꾸면 멀티코어 아키텍처에서 병렬로 실행할수 있다.
		 * 
		 * parallelStream로 호출하면 스트림의 새로운 기능이 소프트웨어공학적으로 이득을 준다. 7장에서..
		 */
		List<String> lowCaloricDishesName2 = menu.parallelStream().filter(d -> d.getCalories() < 400)
				.sorted(comparing(Dish::getCalories)).map(Dish::getName).collect(toList());



	}
}
