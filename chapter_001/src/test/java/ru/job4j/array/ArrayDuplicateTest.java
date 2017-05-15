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
public class ArrayDuplicateTest {
	/**
	  * Test whenRemoveDuplicatesThenArrayWithoutDuplicate.
	 */
	@Test
    public void whenRemoveDuplicatesThenArrayWithoutDuplicate() {
        ArrayDuplicate test = new ArrayDuplicate();
		String[] result = test.remove(new String[] {"Привет", "Мир", "Привет", "Супер", "Мир"});
		String[] expected = {"Привет", "Мир", "Супер"};
		assertThat(result, is(expected));
    }
}