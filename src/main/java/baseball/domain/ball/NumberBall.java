package baseball.domain.ball;

public class NumberBall {
	public static final int MIN = 1;
	public static final int MAX = 9;

	private final int index;
	private final int number;

	public NumberBall(int index, int number) {
		validateRange(number);
		this.index = index;
		this.number = number;
	}

	private void validateRange(int number) {
		if (number < MIN || number > MAX) {
			throw new IllegalArgumentException("숫자는 1 이상, 9 이하여야 합니다.");
		}
	}
}
