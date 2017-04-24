package ru.job4j.calculator;

/**
 * Class Класс простой калькулятор.
 * @author Kochanov Alexey
 * @version $ld$
 * @since 0.1
*/
public class Calculator {
	/**
	 * Результат.
	*/
	private double result;

	/**
	 * Add Метод складывает переменные.
	 * @param first - первое число.
	 * @param second - второе число.
	*/
	public void add(double first, double second) {
		this.result = first + second;
	}

	/**
	 * Substruct Метод вычитает переменные.
	 * @param first - первое число.
	 * @param second - второе число.
	*/
	public void substruct(double first, double second) {
		this.result = first - second;
	}

	/**
	 * Div Метод делит переменные.
	 * @param first - первое число.
	 * @param second - второе число.
	*/
	public void div(double first, double second) {
		this.result = first / second;
	}

	/**
	 * Multiple Метод умножает переменные.
	 * @param first - первое число.
	 * @param second - второе число.
	*/
	public void multiple(double first, double second) {
		this.result = first * second;
	}

	/**
	 * GetResult Метод возвращает result.
	 * @return Возвращает result.
	*/
	public double getResult() {
		return this.result;
	}
}