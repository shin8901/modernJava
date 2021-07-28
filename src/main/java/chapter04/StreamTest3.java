package chapter04;

import static java.util.stream.Collectors.groupingBy;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class StreamTest3 {

	// java 8 예제
	public static void main(String[] args) {

		/**
		 * 
		 * 
		 * 선언형으로 코드를 구현할수 있다. 루프/if 조건문 등의 제어 블록을 사용해서 어떤 동작을 할지 구현할 필요없이. '저칼로리의 요리만
		 * 선택하라' 같은 동작의 수행을 지정할 수 있다.
		 * 
		 * 3장에서 본거처럼 동작파라미터화를 사용하면, 변하는 요구사항에 쉽게 대응가능.
		 * 
		 * 기존 코드를 복사하여 붙여 넣는 방식을 사용하지 않고 람다표현식 사용해서, 저칼로리 대신 고칼로리필터링 가능.
		 * 
		 * <p>
		 * 
		 * ------------람다------------------람다--------------람다 //
		 * 
		 * filter ------------> sorted ------------> map ------------> collect
		 * 
		 * 위 내용처럼 filter sorted, map, collect 같은 여러 빌딩 블록 연산을 연결해서 복잡한 데이터 처리 파이프라인 가능.
		 * 
		 * 
		 * 결과적으로 우리는 데이터 처리과정을 병렬화하면서 스레드와 락을 걱정할 필요가 없다.
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
