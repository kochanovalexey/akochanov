package ru.job4j.loop;

/**
 * Class Класс считает сумму четных чисел в диапазоне.
 * @author Kochanov Alexey
 * @version $ld$
 * @since 0.1
*/
public class Counter {
	/**
	 * add - Метод возращающий сумму четных чисел в диапазоне от start до finish.
	 * @param start - начало диапазона.
	 * @param finish - конец диапазона.
	 * @return - сумма четных чисел.
	*/
	public int add(int start, int finish) {
		int sumEven = 0;
		for (int i = start; i < finish; i++) {
			if (i % 2 == 0) {
				sumEven += i;
			}
		}
		return sumEven;
	}
}