package chapter03;

import java.util.Comparator;

import chapter02.Apple;

public class LamdaTest2 {
	public static void main(String[] args) {

		Comparator<Apple> byWeight = (Apple a1, Apple a2) -> Integer.compare(a1.getWeight(), a2.getWeight());

	}
}
