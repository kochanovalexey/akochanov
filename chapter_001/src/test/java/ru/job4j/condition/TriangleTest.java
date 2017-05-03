package ru.job4j.condition;

import org.junit.Test;

import static org.junit.Assert.assertThat;
import static org.hamcrest.number.IsCloseTo.closeTo;

/**
 *Test.
 *
 * @author Kochanov Alexey dzot-1993@yandex.ru
 * @version $ld$
 * @since 0.1
*/
public class TriangleTest {
	/**
	 * Test Тест на вычисление площади треугольника.
	*/
	@Test
	public void calculateTheAreaOTheTriangle() {
		Point a = new Point(1, 2);
		Point b = new Point(3, 1);
		Point c = new Point(5, 4);
		Triangle testTriangle = new Triangle(a, b, c);
		double result = testTriangle.area();
		double excepted = 4.0;
		assertThat(result, closeTo(excepted, 0.01));
	}

	/**
	 * Test Тест на ситуацию, когда по точкам невозможно постоить треугольник.
	*/
	@Test
	public void whenImpossibleToBuildTriangle() {
		Point a = new Point(1, 1);
		Point b = new Point(1, 1);
		Point c = new Point(5, 4);
		Triangle testTriangle = new Triangle(a, b, c);
		double result = testTriangle.area();
		double excepted = 0.0;
		assertThat(result, closeTo(excepted, 0.01));
	}
}