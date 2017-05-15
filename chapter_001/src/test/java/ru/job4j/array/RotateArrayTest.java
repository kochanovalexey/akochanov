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
public class RotateArrayTest {
	/**
	  * Test whenRotateTwoRowTwoColArrayThenRotatedArray.
	 */
	@Test
    public void whenRotateTwoRowTwoColArrayThenRotatedArray() {
        RotateArray test = new RotateArray();
		int[][] result = test.rotate(new int[][] {{1, 2}, {3, 4}});
		int[][] expected = {{3, 1}, {4, 2}};
		assertThat(result, is(expected));
    }

	/**
	  * Test whenRotateThreeRowThreeColArrayThenRotatedArray.
	 */
    @Test
    public void whenRotateThreeRowThreeColArrayThenRotatedArray() {
        RotateArray test = new RotateArray();
		int[][] result = test.rotate(new int[][] {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}});
		int[][] expected = {{7, 4, 1}, {8, 5, 2}, {9,  6, 3}};
		assertThat(result, is(expected));
    }
}