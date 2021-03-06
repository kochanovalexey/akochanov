package ru.job4j.max;

/**
 * Class Класс вычисляющий максимальное значение.
 * @author Kochanov Alexey
 * @version $ld$
 * @since 0.1
*/
public class Max {
	/**
	 * Max Метод возвращает максимальное число из first и second.
	 * @param first - первое число.
	 * @param second - второе число.
	 * @return - максимальное число.
	*/
	public int max(int first, int second) {
		return first > second ? first : second;
	}
	/**
	 * Max Метод возвращает максимальное число из first, second или third.
	 * @param first - первое число.
	 * @param second - второе число.
	 * @param third - третье число.
	 * @return - максимальное число.
	*/
	public int max(int first, int second, int third) {
		return max(max(first, second), third);
	}
}