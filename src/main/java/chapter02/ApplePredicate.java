package inActionJava.chapter02;

public interface ApplePredicate {
	boolean test(Apple apple);
}

class AppleHeavyWeightPredicate implements ApplePredicate {

	@Override
	public boolean test(Apple apple) {
		return apple.getWeight() > 150;
	}

}

class AppleGreenColorPredicate implements ApplePredicate {

	@Override
	public boolean test(Apple apple) {
		return Color.GREEN.equals(apple.getColor());
	}
}