package ru.job4j.strategy;

import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Test.
 *
 * @author Kochanov Alexey
 * @version $ld$
 * @since 0.1
 */
public class StrategyTest extends Paint {
    /**
     * Test whenPrintSquare.
     */
    @Test
    public void whenPrintSquare() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Paint paint = new Paint();
        paint.draw(new Square());
        final String line = "0 0 0 0 0 " + System.getProperty("line.separator");
        assertThat(out.toString(), is(String.format("%s%s%s%s", line, line, line, line)));
    }
    /**
     * Test whenPrintTriangle.
     */
    @Test
    public void whenPrintTriangle() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Paint paint = new Paint();
        paint.draw(new Triangle());
        final String line = System.getProperty("line.separator");
        assertThat(out.toString(), is(String.format("O%sOOO%sOOOOO%sOOOOOOO%sOOOOOOOOO%s", line, line, line, line, line)));
    }
}
