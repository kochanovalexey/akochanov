package ru.job4j.max;

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
 public class MaxTest {
	 /**
	  * Test max when first more than two.
	 */
	 @Test
	 public void whenMaxFirstMoreThanTwo() {
		 Max object = new Max();
		 int result = object.max(2, 1);
		 int expected = 2;
		 assertThat(result, is(expected));
	 }

	 /**
	  * Test max when two more than first.
	 */
	 @Test
	 public void whenMaxTwoMoreThanOne() {
		 Max object = new Max();
		 int result = object.max(2, 4);
		 int expected = 4;
		 assertThat(result, is(expected));
	 }
 }