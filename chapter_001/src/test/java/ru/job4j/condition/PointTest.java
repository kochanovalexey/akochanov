package ru.job4j.condition;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 *Test.
 *
 * @author Kochanov Alexey dzot-1993@yandex.ru
 * @version $ld$
 * @since 0.1
*/
 public class PointTest {
	 /**
	  * Test Тест, когда точка координат находится на функции y(x) = a * x + b.
	 */
	 @Test
	 public void whenPointIsOnTheFunction() {
		 Point object = new Point(2, 4);
		 boolean result = object.is(2, 0);
		 boolean expected = true;
		 assertThat(result, is(expected));
	 }

	 /**
	  * Test Тест, когда точка координат не находится на функции y(x) = a * x + b.
	 */
	 @Test
	 public void whenPointIsNotOnTheFunction() {
		 Point object = new Point(2, 4);
		 boolean result = object.is(2, 1);
		 boolean expected = false;
		 assertThat(result, is(expected));
	 }
 }