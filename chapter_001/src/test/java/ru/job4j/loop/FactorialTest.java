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
public class FactorialTest {
	/**
	  * Test whenCalculateFactorialForFiveThenOneHundreedTwenty.
	 */
    @Test
    public void whenCalculateFactorialForFiveThenOneHundreedTwenty() {
        Factorial object = new Factorial();
		int result = object.calc(5);
		int expected = 120;
		assertThat(result, is(expected));
    }
	/**
	  * Test whenCalculateFactorialForZeroThenOne.
	 */
    @Test
    public void whenCalculateFactorialForZeroThenOne() {
        Factorial object = new Factorial();
		int result = object.calc(0);
		int expected = 1;
		assertThat(result, is(expected));
    }
}