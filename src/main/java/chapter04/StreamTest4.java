package chapter04;

import static java.util.stream.Collectors.groupingBy;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class StreamTest4 {

	// java 8 예제
	public static void main(String[] args) {

		/**
		 * 
		 * 자바 8 스트림 API을 요약해본다면
		 *
		 * 선언형 : 더간결해지고
		 * 
		 * 조립할수있음 : 유연성이 좋아지고
		 * 
		 * 병렬화 : 성능이 좋아진다.
		 * 
		 */

		/*
		 * 스트림 api는 매우 비싼 연산. 아래 예제는 6장까지 하믄 나온당.
		 */
		List<Dish> menu = new ArrayList<>();
		Map<Dish.Type, List<Dish>> dishesByType = menu.stream().collect(groupingBy(Dish::getType));

		/**
		 * 위 코드는 다음과같은 결과를도출할수있다.
		 * 
		 * <p>
		 * FISH = [prawn,salmon]
		 * 
		 * OTHER = [french fries,rice,season fruit,pizza]
		 * 
		 * FISH = [pork,beef,chicken]
		 */

		/**
		 * 다른 라이브러리도 사용가능하니, 참고해보자, 구아바,아파치,람다제이
		 */

	}
}
