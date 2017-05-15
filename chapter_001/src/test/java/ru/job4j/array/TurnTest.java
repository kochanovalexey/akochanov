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
public class TurnTest {
	/**
	  * Test whenTurnArrayWithEvenAmountOfElementsThenTurnedArray.
	 */
    @Test
	public void whenTurnArrayWithEvenAmountOfElementsThenTurnedArray() {
		Turn test = new Turn();
		int[] result = test.back(new int[] {2, 6, 1, 4});
		int[] expected = {4, 1, 6, 2};
		assertThat(result, is(expected));
	}
	/**
	  * Test whenTurnArrayWithOddAmountOfElementsThenTurnedArray.
	 */
	@Test
    public void whenTurnArrayWithOddAmountOfElementsThenTurnedArray() {
        Turn test = new Turn();
		int[] result = test.back(new int[] {1, 2, 3, 4, 5});
		int[] expected = {5, 4, 3, 2, 1};
		assertThat(result, is(expected));
    }
}