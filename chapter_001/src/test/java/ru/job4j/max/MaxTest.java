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
	  * Test max there two integer when first more than two.
	 */
	 @Test
	 public void whenMaxFirstMoreThanTwo() {
		 Max object = new Max();
		 int result = object.max(2, 1);
		 int expected = 2;
		 assertThat(result, is(expected));
	 }

	 /**
	  * Test max there two integer when two more than first.
	 */
	 @Test
	 public void whenMaxTwoMoreThanOne() {
		 Max object = new Max();
		 int result = object.max(2, 4);
		 int expected = 4;
		 assertThat(result, is(expected));
	 }

	 /**
	  * Test max there three integer when first more than others.
	 */
	 @Test
	 public void whenMaxFirstMoreThanOthers() {
		 Max object = new Max();
		 int result = object.max(3, 1, 2);
		 int expected = 3;
		 assertThat(result, is(expected));
	 }

	 /**
	  * Test max there three integer when second more than others.
	 */
	 @Test
	 public void whenMaxSecondMoreThanOthers() {
		 Max object = new Max();
		 int result = object.max(3, 4, 2);
		 int expected = 4;
		 assertThat(result, is(expected));
	 }

	 /**
	  * Test max there three integer when third more than others.
	 */
	 @Test
	 public void whenMaxThirdMoreThanOthers() {
		 Max object = new Max();
		 int result = object.max(3, 1, 7);
		 int expected = 7;
		 assertThat(result, is(expected));
	 }
 }