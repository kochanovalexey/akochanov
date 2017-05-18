package ru.job4j;

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
	 * Test whenSubIsSubstringOfOriginString.
	*/
	@Test
	public void whenSubIsSubstringOfOriginString() {
		TestTask test = new TestTask();
		boolean result = test.contains("Я люблю мир", "люблю");
		boolean expected  = true;
		assertThat(result, is(expected));
	}
}