package ru.job4j.array;

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
public class TestTaskTest {
	/**
	 * Test whenTwoArrayToOneArray.
	*/
	@Test
	public void whenTwoArrayToOneArray() {
		TestTask test = new TestTask();
		int[] result = test.copyTwoArrayToOne(new int[] {1, 3, 5, 9}, new int[] {2, 3, 4, 7});
		int[] expected  = {1, 2, 3, 3, 4, 5, 7, 9};
		assertThat(result, is(expected));
	}
}