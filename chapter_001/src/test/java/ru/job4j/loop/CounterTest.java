package ru.job4j.loop;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Test.
 *
 * @author Kochanov Alexey
 * @version $ld$
 * @since 0.1
*/
public class CounterTest {
	/**
	  * Test add.
	 */
	 @Test
	 public void calculateEvenInteger() {
		 Counter object = new Counter();
		 int result = object.add(11, 17);
		 int expected = 42;
		 assertThat(result, is(expected));
	 }
}