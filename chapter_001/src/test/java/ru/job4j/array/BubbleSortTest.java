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
public class BubbleSortTest {
	/**
	  * Test whenTurnArrayWithEvenAmountOfElementsThenTurnedArray.
	 */
    @Test
	public void whenSortArrayWithTenElementsThenSortedArray() {
		BubbleSort test = new BubbleSort();
		int[] result = test.sort(new int[] {1, 5, 4, 2, 3, 1, 7, 8, 0, 5});
		int[] expected = {0, 1, 1, 2, 3, 4, 5, 5, 7, 8};
		assertThat(result, is(expected));
	}
}