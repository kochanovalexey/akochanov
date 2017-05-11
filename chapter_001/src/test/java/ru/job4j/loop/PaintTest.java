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
public class PaintTest {
	/**
	  * Test whenPiramidWithHeightTwoThenStringWithTwoRows.
	 */
    @Test
    public void whenPiramidWithHeightTwoThenStringWithTwoRows() {
        Paint paint = new Paint();
        String result = paint.piramid(2);
		final String line = System.getProperty("line.separator");
        String expected = String.format(" ^ %s^^^%s", line, line);
        assertThat(result, is(expected));
    }
	/**
	  * Test whenPiramidWithHeightThreeThenStringWithThreeRows.
	 */
    @Test
    public void whenPiramidWithHeightThreeThenStringWithThreeRows() {
       Paint paint = new Paint();
        String result = paint.piramid(3);
		final String line = System.getProperty("line.separator");
        String expected = String.format(" ^ %s^^^%s^^^^^%s", line, line, line);
        assertThat(result, is(expected));
    }
}