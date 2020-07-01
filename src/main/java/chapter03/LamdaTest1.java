package chapter03;

import java.util.Comparator;

import chapter02.Apple;

public class LamdaTest1 {
	public static void main(String[] args) {

		Comparator<Apple> byWeight = new Comparator<Apple>() {
			@Override
			public int compare(Apple a1, Apple a2) {
				return Integer.compare(a1.getWeight(), a2.getWeight());
			}
		};

	}
}
