package ru.job4j.loop;

/**
 * Class Класс вычисляющий факториал числа.
 * @author Kochanov Alexey
 * @version $ld$
 * @since 0.1
*/
public class Factorial {
	/**
	 * calc Метод вычисляющий факториал.
	 * @param n - число, факториал которого надо вычислить.
	 * @return - факториал числа n.
	*/
	public int calc(int n) {
		if (n == 0) {
			return 1;
		} else {
			int factorial = 1;
			for (int i = 1; i <= n; i++) {
				factorial *= i;
			}
			return factorial;
		}
	}
}